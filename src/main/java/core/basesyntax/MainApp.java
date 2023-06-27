package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck1 = new Truck();
        Machine buldozer1 = new Bulldozer();
        Machine excavator1 = new Excavator();

        Machine[] machines = {truck1,buldozer1,excavator1};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
