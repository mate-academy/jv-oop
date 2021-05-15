package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck alfa = new Truck();
        Bulldozer beta = new Bulldozer();
        Excavator gamma = new Excavator();

        alfa.doWork();
        beta.doWork();
        gamma.doWork();

        alfa.stopWork();
        beta.stopWork();
        gamma.stopWork();
    }
}
