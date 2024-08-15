package core.basesyntax;

public class Buldoser extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldoser started working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldoser stopped working...");
    }
}
