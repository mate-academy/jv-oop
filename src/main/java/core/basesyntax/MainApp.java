package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine buildozer = new Bulldozer();
        Machine[] machines = {truck, excavator, buildozer};
        for (Machine m : machines) {
            m.doWork();
        }
        for (Machine m : machines) {
            m.stopWork();
        }
    }
}
