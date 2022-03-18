package core.basesyntax;

public class MainApp {
    public static void main() {
        Machine volkswagen = new Truck();
        volkswagen.setName("Volkswagen");
        volkswagen.doWork();
        volkswagen.stopWork();

        Machine caterpillar = new Bulldozer();
        caterpillar.setName("Caterpillar");
        caterpillar.doWork();
        caterpillar.stopWork();

        Machine hyundai = new Excavator();
        hyundai.setName("Hyundai");
        hyundai.doWork();
        hyundai.stopWork();
    }
}
