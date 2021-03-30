package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        System.out.println(truck.doWork());
        System.out.println(excavator.doWork());
        System.out.println(bulldozer.doWork());
        System.out.println(truck.stopWork());
        System.out.println(excavator.stopWork());
        System.out.println(bulldozer.stopWork());
    }
}
