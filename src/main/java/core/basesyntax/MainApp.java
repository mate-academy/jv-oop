package core.basesyntax;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Machine[] machines = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
