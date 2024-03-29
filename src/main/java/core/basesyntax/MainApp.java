package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine currentMachine : machines) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }

}
