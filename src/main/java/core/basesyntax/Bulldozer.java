package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello, I'm Bulldozer " + this + ". I've started work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Goodbye. I've just finished. Your " + this + ".");
    }
}
