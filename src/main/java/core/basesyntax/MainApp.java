package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine e = new Excavator();
        Machine b = new Bulldozer();
        Machine t = new Truck();
        e.doWork();
        b.doWork();
        t.doWork();
        e.stopWork();
        b.stopWork();
        t.stopWork();
    }
}
