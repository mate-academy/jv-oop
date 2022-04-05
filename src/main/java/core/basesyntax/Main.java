package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();

        Machine [] Machines = new Machine[] {Truck, Bulldozer, Excavator};
        for (int i = 0; i < 6; i++) {
            if (i > 2) {
                Machines[i - 3].stopWork();
                continue;
            }
            Machines[i].doWork();
        }
    }
}
