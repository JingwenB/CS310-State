package StateMachine;

public class Adult implements StageOfLife {
    @Override
    public void liveAndAdvance(Person person) {
        System.out.println("TAXES!?");
        person.setStageOfLife(new Retired());
    }
}
