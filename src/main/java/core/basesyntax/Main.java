package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine [] allKindMachines = new Machine [] {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine eachMachineWork : allKindMachines) {
            eachMachineWork.doWork();
            eachMachineWork.stopWork();
        }
    }
}
