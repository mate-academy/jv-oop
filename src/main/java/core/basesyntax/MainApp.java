package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Machine[] arrayMachines = new Machine[]{excavator, bulldozer, truck};
        for (Machine c : arrayMachines) {
            c.doWork();
            c.stopWork();
        }
    }
}
