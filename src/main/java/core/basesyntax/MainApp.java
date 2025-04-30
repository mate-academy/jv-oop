package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] machines = new Machine[]{truck, bulldozer, excavator};
        for (Machine values : machines) {
            values.doWork();
            values.stopWork();
        }
    }
}
