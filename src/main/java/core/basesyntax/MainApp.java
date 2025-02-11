package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] vehicles = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine vehicle : vehicles) {
            vehicle.doWork();
            vehicle.stopWork();// Polimorfizm - odpowiednia metoda zostanie wywołana
        }

    }
}
