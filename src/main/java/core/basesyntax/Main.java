package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine buldozer = new Buldozer();
        Machine excavator = new Excavator();
        Machine[] machines = {truck, buldozer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
