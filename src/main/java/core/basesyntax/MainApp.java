package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Create an array of Machine objects (Polymorphism)
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
