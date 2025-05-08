package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Machine[] machines = {excavator, truck, bulldozer};
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
