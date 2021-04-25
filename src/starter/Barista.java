package starter;

public class Barista {
    private int annoyingDelay;
    private String mood;
    private int customerNumber=0;


    public void makeCoffee() throws InterruptedException {
        setMood();
        expressCoffee();
        goodbye();
    }

    private void goodbye() throws InterruptedException {
        if (mood =="Chatty") System.out.println("Have a lovely day!!!!");
        if (mood =="Curt")   System.out.println("bye.");
        Thread.sleep(annoyingDelay);
    }

    private void expressCoffee() throws InterruptedException {
        if (mood =="Chatty") System.out.println("Ooh look at that liquid gold!");
        if (mood =="Curt")   System.out.println("...");
        Thread.sleep(annoyingDelay);
    }

    public void setMood() throws InterruptedException {
        mood = "Chatty";
        customerNumber++;
        if (customerNumber%2==0) { // if feeling rushed
            mood = "Curt";
        }
        System.out.println("I'm feeling "+mood);
        this.mood = mood;
        if (mood =="Chatty") annoyingDelay = 3000;
        if (mood =="Curt") annoyingDelay = 1000;
    }

    // if-statement is everywhere … -> duplicated code & switch on type ->
    // make state hierarchy (state interface[mood interface]), make ChattyBehaviour and CurtBehaviour,
    // our instinct is to refactor the switch to different types of Barrista


}
