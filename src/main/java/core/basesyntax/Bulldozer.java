package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " have just started working");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName()+ " have just stopped working");
    }
}
