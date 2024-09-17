package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer(true, false);
        Truck truck = new Truck(false, true);
        Excavator excavator = new Excavator(true, true);
        Machine[] machines = {bulldozer, truck, excavator};
        printReult(machines);
    }

    public static void printReult(Machine[] machines) {
        for (Machine working : machines) {
            working.doWork();
            working.stopWork();
        }
    }
}
