package solution;

public class ChattyMood implements Mood {
    private int annoyingDelay = 3000;

    public void goodbye() throws InterruptedException {
        System.out.println("Have a lovely day!!!!");
        Thread.sleep(annoyingDelay);
    }

    public void expressCoffee() throws InterruptedException {
        System.out.println("Ooh look at that liquid gold!");
        Thread.sleep(annoyingDelay);
    }

    public String toString(){
        return "Chatty";
    }
}
