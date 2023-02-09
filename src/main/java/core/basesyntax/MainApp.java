package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        String[] machines = new String[] {"Truck", "Bulldozer", "Excavator"};
        for (String machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
