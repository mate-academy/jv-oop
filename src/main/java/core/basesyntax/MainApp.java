package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        //Create array within Machine abstraction
        Machine[] machineList = {
                new Bulldozer(),
                new Excavator(),
                new Truck()
        };
        //Call method doWork in loop
        for (Machine machine : machineList) {
            machine.doWork();
        }
        //Call method stopWork in loop
        for (Machine machine : machineList) {
            machine.stopWork();
        }
    }
}
