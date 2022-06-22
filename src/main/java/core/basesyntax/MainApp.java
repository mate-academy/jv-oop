package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machineNow : machine) {
            machineNow.doWork();
            machineNow.stopWork();
        }
    }
}
