package core.basesyntax;

public abstract class Machine {

    String typeMachine = "";

    public void doWork() {
        String Message_doWork = " started its work.";
        System.out.println(typeMachine + Message_doWork);
    }

    public void stopWork() {
        String Message_stopWork = " stopped its work.";
        System.out.println(typeMachine + Message_stopWork);
    }

}
