package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machins = {truck, bulldozer, excavator};
        for (Machine machine: machins) {
            if (machine == truck) {
                truck.doWork();
                bulldozer.stopWork();
                excavator.stopWork();
            } else if (machine == bulldozer) {
                bulldozer.doWork();
                truck.stopWork();
                excavator.stopWork();
            } else {
                excavator.doWork();
                truck.stopWork();
                bulldozer.stopWork();
            }
        }

    }

}
