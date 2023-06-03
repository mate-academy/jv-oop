package core.basesyntax;

public class MainApp {
    public static void main(String[] args){
        Machine[] machines = new Machine[3];
        Excavator excavator = new Excavator();
        machines[0] = excavator;
        Truck truck = new Truck();
        machines[1] = truck;
        Bulldozer bulldozer = new Bulldozer();
        machines[2] = bulldozer;
        for (Machine machine: machines){
            machine.doWork();
            machine.stopWork();
        }
    }






}
