package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine fv122 = new Excavator();
        Machine opc47 = new Bulldozer();
        Machine skania = new Truck();
        Machine[] buildingMachines = new Machine[] {fv122, opc47, skania};
        for (int i = 0; i < buildingMachines.length; i++) {
            buildingMachines[i].doWork();
        }
        System.out.println("'Excavator, Bulldozer, and Truck have been working all day and then...\n");
        for (int i = 0; i < buildingMachines.length; i++) {
            buildingMachines[i].stopWork();
        }
    }
}