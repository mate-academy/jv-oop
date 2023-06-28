package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machinesArray = new Machine[]{bulldozer, excavator, truck};
        for (int i = 0; i < machinesArray.length; i++) {
            Machine machine = machinesArray[i];
            machine.doWork();
            machine.stopWork();
        }
    }
}
