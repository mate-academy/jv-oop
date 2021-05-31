package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Я починаю працювати, ану посторонись!");
    }

    @Override
    public void stopWork() {
        System.out.println("Усьо, можна перекурити");
    }
}
