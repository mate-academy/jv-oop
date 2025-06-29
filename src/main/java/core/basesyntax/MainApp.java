package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] arrMachines = {new Bulldozer(),new Excavator(),new Truck()};
        for (Machine machine : arrMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
