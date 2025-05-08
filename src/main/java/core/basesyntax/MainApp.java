package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};

        for (Machine currentMachine : machines) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }
}
