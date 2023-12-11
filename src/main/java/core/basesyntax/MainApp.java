package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck("44", false);
        machines[1] = new Bulldozer("2", true);
        machines[2] = new Excavator("1", false);
        for (int i = 0; i < machines.length; i++) {
            if (machines[i].isWorking()) {
                machines[i].doWork();
            } else {
                machines[i].stopWork();
            }
        }
    }
}
