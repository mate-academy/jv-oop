package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

        for (Machine machinesItem : machines ) {
            machinesItem.doWork();
            machinesItem.stopWork();
        }
    }
}
