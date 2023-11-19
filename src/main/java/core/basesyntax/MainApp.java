package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine[] machines = {excavator, truck, bulldozer};

        for (Machine index : machines) {
            index.doWork();
            index.stopWork();
        }
    }
}
