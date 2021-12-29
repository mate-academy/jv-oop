package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        machines[0] = excavator;
        machines[1] = bulldozer;
        machines[2] = truck;
        for (int i = 0; i < machines.length; i++){
            machines[i].doWork();
            machines[i].stopWork();
        }
    }

}
