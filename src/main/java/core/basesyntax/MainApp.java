package core.basesyntax;

public class MainApp {
    public void showWork() {
        Machine[] machineArray = {new Excavator(), new Truck(), new Bulldozer()};
        for (Machine numberOfArray : machineArray) {
            numberOfArray.doWork();
            numberOfArray.stopWork();
        }
    }
}
