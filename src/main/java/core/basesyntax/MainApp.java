package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine banderomobil = new Truck();
        Machine zil = new Bulldozer();
        Machine gazon = new Exavator();

        banderomobil.doWork();
        zil.doWork();
        gazon.doWork();

        banderomobil.stopWork();
        zil.stopWork();
        gazon.stopWork();

    }
}
