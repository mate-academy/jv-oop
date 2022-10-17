package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] allMachines = new Machine[]{excavator, bulldozer, truck};
        for (Machine a : allMachines) {
            a.doWork();
            a.stopWork();
        }
    }
}
