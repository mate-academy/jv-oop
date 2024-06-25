package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName()
                + ": "
                + "Bulldozer start working");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName()
                + ": "
                + "Bulldozer stop working");
    }
}
