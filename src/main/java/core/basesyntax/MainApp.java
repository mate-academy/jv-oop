package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] machinesArray = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };
        System.out.println("Start of machine operation:");
        for (Machine machine : machinesArray) {
            machine.doWork();
        }
        System.out.println("End of machine operation:");
        for (Machine machine : machinesArray) {
            machine.stopWork();
        }

    }
}
