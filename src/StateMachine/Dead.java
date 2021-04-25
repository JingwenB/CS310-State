package StateMachine;

public class Dead implements StageOfLife {
    @Override
    public void liveAndAdvance(Person person) {
        System.out.printf("uhoh");
        System.exit(0);
    }
}
