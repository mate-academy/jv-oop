package core.basesyntax;

public class MainApp {

    public static void main(String [] arg) {
        Truck tru = new Truck();
        Bulldozer bul = new Bulldozer();
        Excavator exc = new Excavator();
        tru.doWork();
        bul.doWork();
        exc.doWork();
        tru.stopWork();
        bul.stopWork();
        exc.stopWork();
    }
}
