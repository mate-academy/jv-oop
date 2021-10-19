package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Truck();
        Machine buildozer = new Truck();
        Machine[] machines = {truck, excavator, buildozer};
        for (Machine m : machines) {
            m.doWork();
        }
        for (Machine m : machines) {
            m.stopWork();
        }
    }
}
