package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] mArray = new Machine[3];
        mArray[0] = new Truck();
        mArray[1] = new Buldozer();
        mArray[2] = new Excavator();

        for (Machine m: mArray) {
            m.doWork();
            m.stopWork();
        }
    }

}
