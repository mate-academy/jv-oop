package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine caterpillar = new Excavator();
        Machine mitsubishi = new Bulldozer();
        Machine iveco = new Truck();
        caterpillar.doWork();
        mitsubishi.doWork();
        iveco.doWork();
        caterpillar.stopWork();
        mitsubishi.stopWork();
        iveco.stopWork();
    }

}
