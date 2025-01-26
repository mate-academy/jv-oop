package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine atruck = new Truck();
        Machine abulldozer = new Bulldozer();
        Machine aexcavator = new Excavator();
        Machine[] amachine = {atruck, abulldozer, aexcavator};
        for (core.basesyntax.Machine machine : amachine) {
            System.out.println(machine.doWork());
            System.out.println(machine.stopWork());
        }
    }
}
