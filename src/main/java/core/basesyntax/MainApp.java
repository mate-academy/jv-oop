package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
        }

        System.out.println();

        for (Machine machine : machines) {
            machine.isActive();
        }

        System.out.println();

        for (Machine machine : machines) {
            if (machine.isActive()) {
                machine.stopWork();
            }
        }

    }
}
