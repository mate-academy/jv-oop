package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.setName("Excavator");

        Machine truck = new Truck();
        truck.setName("Trucker");


        Machine bulldozer = new Bulldozer();
        bulldozer.setName("Bulldozer");

        Machine[] machines = new Machine[] {excavator, truck, bulldozer};
        for (Machine machin : machines) {
            machin.doWork();
            machin.stopWork();
        }

    }
}


