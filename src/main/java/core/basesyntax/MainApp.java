package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        // All executable code goes inside this method
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}