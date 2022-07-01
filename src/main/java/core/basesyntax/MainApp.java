package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.setName("Excavat");

        Machine truck = new Truck();
        truck.setName("Trucker");

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("Bull");

        Machine[] machines = new Machine[] {excavator, truck, bulldozer};
        for (Machine machin : machines) {
            machin.doWork();
            machin.stopWork();
        }
    }
}
