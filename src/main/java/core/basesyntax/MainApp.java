package core.basesyntax;
public class MainApp {
    public static void mainApp(String[] args) {
        System.out.println("example");
        Machine[] machineArray = {new Truck("truck"), new Bulldozer("bulldozer"), new Excavator("excavator")};
        for (Machine element: machineArray) {
            element.doWork();
            element.stopWork();
        }
    }
}