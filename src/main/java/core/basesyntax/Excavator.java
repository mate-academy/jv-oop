package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void doWork() {
        System.out.println("Экскаватор " + this.model + " начинает свою работу!");
    }

    @Override
    public void stopWork() {
        System.out.println("Экскаватор " + this.model + " останавливает свою работу!");
    }
}
