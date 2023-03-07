package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] mashines = new Machine[] {truck, bulldozer, excavator};

        for (Machine machine : mashines) {
            machine.doWork();
        }

        for (Machine machine : mashines) {
            machine.stopWork();
        }
    }
}

