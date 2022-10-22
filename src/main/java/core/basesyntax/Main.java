package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Truck t = new Truck();
        Bulldozer b = new Bulldozer();
        Excavator e = new Excavator();
        Machine[] array = {t, b, e};
        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
