package core.basesyntax;
public class Excavator extends Machine {
    @java.lang.Override
    public void doWork() {
        System.out.println("Excavator  started work" );
    }
    @java.lang.Override
    public void stopWork() {
        System.out.println("Excavator stopped work");
    }
}
