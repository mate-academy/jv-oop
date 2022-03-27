package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator one = new Excavator();
        Bulldozer two = new Bulldozer();
        Truck three = new Truck();

        one.doWork();
        one.stopWork();
        two.doWork();
        two.stopWork();
        three.doWork();
        three.stopWork();
    }

}
