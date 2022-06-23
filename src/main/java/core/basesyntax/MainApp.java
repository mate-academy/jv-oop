package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine1 = new Machine[3];
        Machine truck = new Truck();
        machine1[0] = truck;
        Machine bulldozer = new Bulldozer();
        machine1[1] = bulldozer;
        Machine excavator = new Excavator();
        machine1[2] = excavator;
        for (int i = 0; i < 3; i++) {
            machine1[i].doWork();
        }
        for (int i = 0; i < 3; i++) {
            machine1[i].stopWork();
        }
    }
}
