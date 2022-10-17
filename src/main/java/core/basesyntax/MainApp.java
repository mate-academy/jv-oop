package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] buildingTechniqs = { new Truck(), new Excavator(), new Bulldozer(),
                                       new Truck(), new Excavator(), new Bulldozer(),
                                       new Truck(), new Excavator(), new Bulldozer() };
        for (Machine machine: buildingTechniqs) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
