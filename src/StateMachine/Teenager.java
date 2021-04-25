package StateMachine;

public class Teenager implements StageOfLife {
    @Override
    public void liveAndAdvance(Person person) {
        System.out.println("Eye roll");
        person.setStageOfLife(new Adult());
    }
}
