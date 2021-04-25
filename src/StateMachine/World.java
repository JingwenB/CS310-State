package StateMachine;

public class World {

    public static void main(String[] args) {
        Person person = new Person();
        while (true){
            person.behave();
        }
    }
}
