package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine m : machine) {
            m.doWork();
            m.stopWork();
        }
    }

}
