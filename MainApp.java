package core.basesyntax;


public class MainApp {
    public static void main(String[] args){
        Machine[] machines = new Machine[3];
        machines[0] = new Machine.Truck();
        machines[1] = new Machine.Bulldozer();
        machines[2] = new Machine.Excavator();
        for (Machine machine: machines){
            machine.doWork();
            machine.stopWork();
        }

    }






}
