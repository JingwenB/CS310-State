package StateMachine;

public class Baby implements StageOfLife{

    @Override
    public void liveAndAdvance(Person person) {
        System.out.println("Cry cry cry");
        person.setStageOfLife(new Child());
    }
}

