package core.basesyntax;

public abstract class Machine {
    public String getNegativeStatus() {
        return "Sorry, I couldn`t take it anymore, I am done for now !";
    }

    public String getPositiveStatus() {
        return "I am still alive !";
    }

    public abstract void doWork();

    public abstract void stopWork();
}

