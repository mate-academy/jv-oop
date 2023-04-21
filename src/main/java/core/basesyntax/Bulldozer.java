package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("That certain machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("That certain machine stopped its work");
    }
}
