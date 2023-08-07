package core.basesyntax.machine;

public abstract class Machine {
    private String strength = "💪"; //just for fun
    private String relaxing = "🦥"; //just for fun x2

    public abstract void doWork();

    public abstract void stopWork();

    /*
    * I've decided to set package access for these methods because
    * I don't want MainApp class to have access to these methods.
    * */

    String getStrength() {
        return strength;
    }

    String getRelaxing() {
        return relaxing;
    }
}
