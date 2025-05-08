package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine machine = new Truck();
        machine.doWork();
        machine.stopWork();
        machine.setName("Truck");

        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        bulldozer.setName("Bulldozer");

        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        excavator.setName("Excavator");

    }
}
