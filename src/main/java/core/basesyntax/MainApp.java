package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Buldozer buldozer = new Buldozer();
        Truck truck = new Truck();
        Machine[] machines = new Machine [] {excavator, buldozer, truck};

        for (Machine equpment:machines) {
            equpment.doWork();
            equpment.stopWork();
        }
    }
}
