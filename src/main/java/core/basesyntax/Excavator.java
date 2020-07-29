package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Экскаватор начинает свою работу!");
    }

    @Override
    public void stopWork() {
        System.out.println("Экскаватор останавливает свою работу!");
    }
}
