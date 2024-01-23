package core.basesyntax;

public class MainApp {

    public static void main() {

        Machine[] machines;

        {
            machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        }

        for (Machine machine : machines) {
            machine.doWork();
            machine.doStop();
        }
    }
}
