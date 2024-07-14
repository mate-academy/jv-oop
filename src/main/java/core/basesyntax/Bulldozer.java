package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Be careful, the bulldozer  started !!!");

    }

    @Override
    public void stopWork() {
        System.out.println("Dear employees, you can continue to work, "
                + "The bulldozer left to refuel");

    }

}
