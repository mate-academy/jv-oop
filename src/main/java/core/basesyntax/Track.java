package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Трэк начинает свою работу!");
    }

    @Override
    public void stopWork() {
        System.out.println("Трэк останавливает свою работу!");
    }
}
