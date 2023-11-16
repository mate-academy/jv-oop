package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Machine truckReno = new Truck();
        Machine bulldozerCat = new Bulldozer();
        Machine excavatorKamaz = new Excavator();

        Machine [] machines = new Machine[] {truckReno, bulldozerCat, excavatorKamaz};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
        }
        for (int i = 0; i < machines.length; i++) {
            machines[i].stopWork();
        }
    }
}
