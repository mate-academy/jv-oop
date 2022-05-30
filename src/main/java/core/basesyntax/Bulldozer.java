package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " stopped its work");
    }
}
