package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bmw = new Excavator();
        Machine volkswagen = new Bulldozer();
        Machine audi = new Truck();

        bmw.doWork();
        volkswagen.doWork();
        audi.doWork();

        bmw.stopWork();
        volkswagen.stopWork();
        audi.stopWork();
    }
}
