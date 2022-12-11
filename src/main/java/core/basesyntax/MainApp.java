package core.basesyntax;

public class MainApp {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Machine machine1 = new Truck();
        Machine machine2 = new Excavator();
        Machine machine3 = new Bulldozer();
        Machine[] machines = new Machine[]{machine1, machine2, machine3};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
