package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine monsterTruck = new Truck();
        Machine bully = new Bulldozer();
        Machine excavator3000 = new Excavator();

        excavator3000.doWork();
        monsterTruck.doWork();
        bully.doWork();

        excavator3000.stopWork();
        monsterTruck.stopWork();
        bully.stopWork();
    }
}
