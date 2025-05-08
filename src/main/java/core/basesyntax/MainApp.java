package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {(new Excavator()), (new Truck()), (new Bulldozer())};
        for (Machine machineCheck : machine) {
            machineCheck.doWork();
        }
        for (Machine machineCheck : machine) {
            machineCheck.stopWork();
        }
    }
}
