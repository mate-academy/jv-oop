package core.basesyntax;

public class MainApp {
    public static void mainApp(String[] args) {

        Machine[] machines = new Machine[3];
        machines[0] = new Excavator();
        machines[1] = new Bulldozer();
        machines[2] = new Truck();

        for (Machine machine : machines) {
            if (machine == machines[0]) {
                machine.doWork();
                machine.stopWork();
            }
            if (machine == machines[1]) {
                machine.doWork();
                machine.stopWork();
            }
            if (machine == machines[2]) {
                machine.doWork();
                machine.stopWork();
            }
        }
    }
}
