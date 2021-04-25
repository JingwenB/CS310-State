package StateMachine;

public class Retired implements StageOfLife {
    @Override
    public void liveAndAdvance(Person person) {
        System.out.println("Finally! I get a break!");
        person.setStageOfLife(new Dead());
    }
}
