package core.basesyntax;

public class Buldozer extends  Machine{
    @Override
    public void doWork() {
        System.out.println("Buldozer started work");
    }
    @Override
    public void stopwork() {
        System.out.println("Buldozer stopped work");
    }
}
