package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] fleet1 = {new Truck(), new Buldozer(), new Excavator()};
        for (Machine unit : fleet1) {
                unit.doWork();
                unit.stopWork();
             }

    }

}
