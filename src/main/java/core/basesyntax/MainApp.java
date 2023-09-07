package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        String[] machine = { excavator.doWork(), excavator.stopWork(), bulldozer.doWork(),
                bulldozer.stopWork(), truck.doWork(), truck.stopWork() };
        for (String machines : machine) {
            System.out.println(machines);
        }
    }
}
