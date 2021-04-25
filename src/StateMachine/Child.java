package StateMachine;

public class Child implements StageOfLife {
    @Override
    public void liveAndAdvance(Person person) {
        System.out.println("Whine whine whine");
        person.setStageOfLife(new Teenager());
    }
}
