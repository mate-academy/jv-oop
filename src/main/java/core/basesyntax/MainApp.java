package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] industrialTransport = {truck, bulldozer, excavator};
        for (Machine heavyMachine : industrialTransport) {
            heavyMachine.doWork();
            heavyMachine.stopWork();
        }
    }
}
