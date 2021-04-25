package StateMachine;

public class Person {
    private StageOfLife stageOfLife = new Baby();

    public void setStageOfLife(StageOfLife stageOfLife){
        this.stageOfLife = stageOfLife;
    }
    public void behave(){
        stageOfLife.liveAndAdvance(this);
    }
}

// 相当于barista， 应用state interface（stage of life）

