package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bl = new Bulldozer();
        bl.doWork();
        bl.stopWork();
        Truck tr = new Truck();
        tr.doWork();
        tr.stopWork();
        Excavator ex = new Excavator();
        ex.doWork();
        ex.stopWork();
    }
}
