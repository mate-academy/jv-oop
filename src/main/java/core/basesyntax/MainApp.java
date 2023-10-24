package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck1 = new Truck();
        Machine bulldozer1 = new Bulldozer();
        Machine excavator1 = new Excavator();

        Machine[] machines = new Machine[3];
        machines[0] = truck1;
        machines[1] = bulldozer1;
        machines[2] =excavator1;

        for (Machine a : machines) {
            a.doWork();
            a.stopWork();
        }
    }

}
