package solution;

public class CurtMood implements Mood {
    private int annoyingDelay = 1000;

    @Override
    public void goodbye() throws InterruptedException {
        System.out.println("bye.");
        Thread.sleep(annoyingDelay);
    }

    @Override
    public void expressCoffee() throws InterruptedException {
        System.out.println("...");
        Thread.sleep(annoyingDelay);
    }

    public String toString(){
        return "Curt";
    }

}
