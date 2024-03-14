package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine m1 : machine) {
            m1.doWork();
             m1.stopWork();
        }
    }
}

