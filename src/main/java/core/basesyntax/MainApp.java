package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine comatsu = new Bulldozer();
        Machine liebherr = new Excavator();
        Machine caterpillar = new Truck();

        comatsu.doWork();
        liebherr.doWork();
        caterpillar.doWork();

        comatsu.stopWork();
        liebherr.stopWork();
        caterpillar.stopWork();
    }
}
