package core.basesyntax;

public class MainApp {
    public static void main() {

        Machine[] machines = new Machine[3];

        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
        machines[0].setName("Volkswagen");
        machines[1].setName("Caterpillar");
        machines[2].setName("Hyundai");

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
