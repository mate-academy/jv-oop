package core.basesyntax;

public abstract class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine currentMachine : machines) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }
}
