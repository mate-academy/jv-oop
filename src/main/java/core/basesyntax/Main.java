package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] machinesArray = new Machine[] { new Truck(), new Bulldozer(), new Excavator() };
        MainApp machinesNeedToWork = new MainApp();
        machinesNeedToWork.runMachines(machinesArray);

    }
}
