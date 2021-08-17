package core.basesyntax;

public class MainAppTest {
    public static void main(String[] args) {
        Machine [] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
