package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machines = {new Truck(), new Excavator(), new Bulldozer()};

        for (Machine currentMachine : machines) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }
}
