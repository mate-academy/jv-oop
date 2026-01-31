package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine first = new Excavator();
        Machine second = new Truck();
        Machine third = new Bulldozer();
        Machine[] machines = {first, second, third};
        for (Machine comp : machines) {
            comp.doWork();
            comp.stopWork();

        }
    }
}

