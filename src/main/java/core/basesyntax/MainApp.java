package core.basesyntax;

public class MainApp {
    public static void main(String [] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine [] machine = new Machine[]{excavator,bulldozer,truck};
        for (Machine machine1:machine) {
            machine1.doWork();
            machine1.stopWork();
        }
    }
}
