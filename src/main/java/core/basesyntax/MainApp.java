package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine transportStart : machine) {
            transportStart.doWork();
        }
        for (Machine transportStop : machine) {
            transportStop.stopWork();
        }
    }

}
