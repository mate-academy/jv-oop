package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();

        Excavator excavator = new Excavator();

        Bulldozer bulldozer = new Bulldozer();

        Machine[] machines = new Machine[]{excavator,bulldozer,truck};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
            System.out.println("-----------------------");
        }

    }
}
