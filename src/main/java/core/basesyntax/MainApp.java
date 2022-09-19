package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Machine[] machines = new Machine[] {bulldozer, truck, excavator};
        for (Machine elem : machines) {
            elem.doWork();
            elem.stopWork();
        }
    }
}
