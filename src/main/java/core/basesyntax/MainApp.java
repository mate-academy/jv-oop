package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] typeOfMachine = new Machine[]{
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        for (Machine machine : typeOfMachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
