package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        for (Machine m : new Machine[]{new Truck(), new Bulldozer(), new Excavator()}) {
            m.doWork();
            m.stopWork();
        }
    }
}
