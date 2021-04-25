package solution;

public class Barista {
    private Mood mood;
    private int customerNumber=0;


    public void makeCoffee() throws InterruptedException {
        setMood();
        mood.expressCoffee();
        mood.goodbye();
    }

    public void setMood() throws InterruptedException {
        mood = new ChattyMood();
        customerNumber++;
        if (customerNumber%2==0) { // if feeling rushed, remainder == 0 ?
            mood = new CurtMood();
        }
        System.out.println("I'm feeling "+ mood);
    }



}
