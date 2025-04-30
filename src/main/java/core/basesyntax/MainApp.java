package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Machine[] machines = {bulldozer, excavator, truck};
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
