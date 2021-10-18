package core.basesyntax.workflow;

public abstract class MachineWorkingStatus {
    public static void startWorkingDay(Machine machine) {
        machine.doWork();
    }

    public static void endWorkingDay(Machine machine) {
        machine.stopWork();
    }
}
