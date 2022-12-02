package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine kindOfMachine: machinesArray
             ) {
            kindOfMachine.doWork();
            kindOfMachine.stopWork();
        }
    }
}
