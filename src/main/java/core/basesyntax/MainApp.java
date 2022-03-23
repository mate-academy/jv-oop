package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine [] array = {excavator, bulldozer,truck};
        for (Machine m : array) {
            m.doWork();
            m.stopWork();
        }
    }
}
