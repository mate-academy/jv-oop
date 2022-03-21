package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Machine[] machines = {bulldozer, excavator, truck};

        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
        }

        for (int i = 0; i < machines.length; i++) {
            machines[i].stopWork();
        }
    }
}


