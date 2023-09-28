package core.basesyntax;

public class MainApp {
    public void runMachines(Machine[]machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
