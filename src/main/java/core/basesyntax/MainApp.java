package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine buldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine [] arr = {buldozer, excavator, truck};
        for (Machine machine : arr) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
