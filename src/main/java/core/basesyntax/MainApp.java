package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machine = new Machine[3];
        machine[0] = truck;
        machine[1] = bulldozer;
        machine[2] = excavator;
        for (int i = 0; i < machine.length; i++) {
            System.out.println(machine[i].doWork());
            System.out.println(machine[i].stopWork());
        }
    }
}
