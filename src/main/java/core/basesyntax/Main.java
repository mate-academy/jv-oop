package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Truck truck1 = new Truck();
        Bulldozer bulldozer1 = new Bulldozer();
        Excavator excavator1 = new Excavator();

        Machine[] machines = new Machine[]{truck1, bulldozer1, excavator1};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
