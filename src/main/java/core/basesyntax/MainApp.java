package core.basesyntax;

public abstract class MainApp {
    public static void main(String [] args) {
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();
        Machine [] Machines = {new Truck(),new Bulldozer(),new Excavator()};
        for (Machine CurrentMachine : Machines) {
            CurrentMachine.doWork();
            CurrentMachine.stopWork();
        }
    }
}
