package core.basesyntax;

public class Buldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozer start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer stopped working");
    }
}
// added one comment