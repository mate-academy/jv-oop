package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine noisy = new Bulldozer();
        Machine quicky = new Excavator();
        Machine speedy = new Truck();

        noisy.doWork();
        noisy.stopWork();
        quicky.doWork();
        quicky.stopWork();
        speedy.doWork();
        speedy.stopWork();
    }

}
