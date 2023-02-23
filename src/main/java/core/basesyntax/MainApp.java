package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] parkMachine = new Machine[]{bulldozer, truck, excavator};
        for (int i = 0; i < parkMachine.length; i++) {
            System.out.println();
            System.out.println("Machine start work");
            parkMachine[i].doWork();
            System.out.println();
            System.out.println("Machine stop work");
            parkMachine[i].stopWork();

        }
    }
}
