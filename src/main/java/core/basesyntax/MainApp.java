package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine noisy = new Bulldozer();
        Machine quicky = new Excavator();
        noisy.doWork();
        noisy.stopWork();
        quicky.doWork();
        quicky.stopWork();
        Machine speedy = new Truck();
        speedy.doWork();
        speedy.stopWork();
    }

}
