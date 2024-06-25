package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine ex = new Excavator();
        Machine tr = new Truck();
        Machine bl = new Bulldozer();
        Machine[] ar = {ex, tr, bl};

        for (Machine i : ar) {
            i.doWork();
            i.stopWork();
        }
    }

}
