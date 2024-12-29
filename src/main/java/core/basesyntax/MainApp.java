package core.basesyntax;

public class MainApp {
    static Truck truck = new Truck();
    static Bulldozer bulldozer = new Bulldozer();
    static Excavator excavator = new Excavator();
    static Machine[] machines = new Machine[]{truck, bulldozer, excavator};

    public static void printValues() {
        for (Machine values : machines) {
            values.doWork();
            values.stopWork();
        }
    }
    public static void main(String[] args) {
        printValues();
    }
}
