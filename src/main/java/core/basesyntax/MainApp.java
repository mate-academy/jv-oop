package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine [] arrayMachines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : arrayMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
