package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Bulldozer();
        machines[1] = new Truck();
        machines[2] = new Excavator();
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
