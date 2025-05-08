package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] auto = new Machine[3];
        auto[0] = new Exavator();
        auto[1] = new Bulldozer();
        auto[2] = new Truck();

        for (int i = 0; i < auto.length; i++) {
            auto[i].doWork();
        }

        for (int i = 0; i < auto.length; i++) {
            auto[i].stopWork();
        }
    }
}
