package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        truck.setName("Мишаня");
        Machine excavator = new Excavator();
        excavator.setName("Ванёк");
        Machine bulldozer = new Bulldozer();
        bulldozer.setName("Лёник");

        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();

        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}
