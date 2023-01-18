package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();

        Machine [] machines = new Machine[]{excavator, bulldozer, truck};

        for (int i = 0; i < 1; i++) {
            excavator.doWork();
            excavator.stopWork();
            bulldozer.doWork();
            bulldozer.stopWork();
            truck.doWork();
            truck.stopWork();
        }
    }
}
