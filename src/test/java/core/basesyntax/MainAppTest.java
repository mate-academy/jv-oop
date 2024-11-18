package core.basesyntax;

public class MainAppTest {

    private static final int MACHINE_COUNT = 3;

    public static void main(String[] args) {

        Machine[] machines = new Machine[MACHINE_COUNT];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();


        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}