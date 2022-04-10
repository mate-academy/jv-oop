package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();

        /*
        Machine[] machines = new Machine[] {truck, excavator, bulldozer};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
        }
        for (int i = 0; i < machines.length; i++) {
            machines[i].stopWork();
        }
        */
    }
}
