package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Бульдозер начинает свою работу!");
    }

    @Override
    public void stopWork() {
        System.out.println("Бульдозер останавливает свою работу!");
    }
}
