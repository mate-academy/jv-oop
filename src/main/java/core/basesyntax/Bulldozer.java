package core.basesyntax;
public class Bulldozer extends Machine {
    @Override
    public char doWork() {
        System.out.println("Bulldozer started its work");
        return 0;
    }
    @Override
    public char stopWork() {
        System.out.println("Bulldozer stopped its work");
        return 0;
    }
}
