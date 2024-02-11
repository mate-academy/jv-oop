package core.basesyntax;

import junit.framework.TestCase;

public class MainAppTest {
    public static void main(String[] args) {
        MachineTest [] machines = {new TruckTest (), new BulldozerTest(), new ExcavatorTest()};

        for (MachineTest machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}