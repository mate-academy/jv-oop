package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine[] machinesArray = {excavator, bulldozer, truck};
        for (int i = 0; i < machinesArray.length; i++) {
            machinesArray[i].doWork();
            machinesArray[i].stopWork();
        }
    }
}
