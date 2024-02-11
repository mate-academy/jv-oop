package core.basesyntax;

public class MainAppTest {
    public static void main(String[] args) {
        MachineTest [] machines = {new TruckTest (), new BulldozerTest(), new ExcavatorTest()};

        for (MachineTest machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}