package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {

        System.out.println("Buldozzer start work...");
    }

    @Override
    public void stopWork() {

        System.out.println("Buldozzer stop work");
    }

}
