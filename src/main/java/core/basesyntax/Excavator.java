package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello, I'm Excavator " + this + ". I've started work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Goodbye. I've just finished. Your " + this + ".");
    }
}
