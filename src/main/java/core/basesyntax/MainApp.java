package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine[] autoParck = {truck, excavator, bulldozer};
        for (Machine machine : autoParck) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
