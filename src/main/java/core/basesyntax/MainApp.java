package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        System.out.println(truck.doWork());
        System.out.println(bulldozer.doWork());
        System.out.println(excavator.doWork());
        System.out.println(truck.stopWork());
        System.out.println(bulldozer.stopWork());
        System.out.println(excavator.stopWork());
    }
}
