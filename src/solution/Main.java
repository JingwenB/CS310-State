package solution;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Barista barista = new Barista();
        for (int i=0; i<4; i++) {
            barista.makeCoffee();
        }
    }

}
