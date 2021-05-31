package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("БУХАЙ ТВОРИ БУДУЙ РУЙНУЙ");
    }

    @Override
    public void stopWork() {
        System.out.println("Амінь");
    }
}
