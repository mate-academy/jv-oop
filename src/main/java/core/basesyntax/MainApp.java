package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("First solution");

        Machine truck = new Truck() {
        };
        Machine bulldozer = new Bulldozer() {
        };
        Machine excavator = new Excavator() {
        };


        Machine[] machines = new Machine[3];
        machines = (truck, bulldozer, excavator)

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }

    }
}
