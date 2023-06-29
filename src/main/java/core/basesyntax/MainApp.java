package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Machine[] machines = new Machine[] {bulldozer, excavator, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
