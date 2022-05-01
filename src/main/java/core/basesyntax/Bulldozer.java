package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("The bulldozer began its work");
    }

    @Override
    public void stopWork() {
        System.out.println("the bulldozer has finished its work");
    }
}
