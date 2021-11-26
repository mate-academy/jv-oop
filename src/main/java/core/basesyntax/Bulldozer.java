package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("The Bulldozer began its work");
    }
    @Override
    public void stopWork() {
        System.out.println("The Bulldozer has finished its work");
    }
}
