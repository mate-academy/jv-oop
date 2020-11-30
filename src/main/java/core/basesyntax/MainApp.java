package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer(10);
        bulldozer.setName("Omega");
        bulldozer.setYear(2002);

        Machine truck = new Truck(24);
        truck.setName("Alpha");
        truck.setYear(1995);

        Machine excavator = new Excavator(2000);
        excavator.setName("Beta");
        excavator.setYear(2000);

        bulldozer.doWork();
        truck.doWork();
        excavator.doWork();

        bulldozer.endWork();
        truck.endWork();
        excavator.endWork();
    }
}
