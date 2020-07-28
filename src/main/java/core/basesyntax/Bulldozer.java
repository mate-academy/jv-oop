package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void doWork() {
        System.out.println("Бульдозер " + this.model + " начинает свою работу!");
    }

    @Override
    public void stopWork() {
        System.out.println("Бульдозер " + this.model + " останавливает свою работу!");
    }
}
