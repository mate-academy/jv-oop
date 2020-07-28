package core.basesyntax;

public class Track extends Machine {
    public Track(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void doWork() {
        System.out.println("Трэк " + this.model + " начинает свою работу!");
    }

    @Override
    public void stopWork() {
        System.out.println("Трэк " + this.model + " останавливает свою работу!");
    }
}
