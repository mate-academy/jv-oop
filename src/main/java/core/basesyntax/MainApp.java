package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayMachines = {new Bulldozer(), new Truck(), new Excavator()};

        for (Machine machine : arrayMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
