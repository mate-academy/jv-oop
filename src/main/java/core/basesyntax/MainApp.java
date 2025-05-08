package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine certainMachine : machines) {
            certainMachine.doWork();
            certainMachine.stopWork();
        }
    }
}
