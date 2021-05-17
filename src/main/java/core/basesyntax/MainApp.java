package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine alfa = new Truck();
        Machine beta = new Bulldozer();
        Machine gamma = new Excavator();

        alfa.doWork();
        beta.doWork();
        gamma.doWork();

        alfa.stopWork();
        beta.stopWork();
        gamma.stopWork();
    }
}
