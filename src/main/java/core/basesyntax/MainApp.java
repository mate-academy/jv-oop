package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine array1 = new Bulldozer();
        Machine array2 = new Excavator();
        Machine array3 = new Truck();
        array1.doWork();
        array2.doWork();
        array3.stopWork();
        array1.stopWork();
        array2.stopWork();
        array3.stopWork();
    }
}
