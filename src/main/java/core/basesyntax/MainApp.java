package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
        }

        System.out.println("---All machines finished their tasks---");

        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
