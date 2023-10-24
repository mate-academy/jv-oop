package main.java.core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine buldozer = new Buldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machines = {buldozer, excavator, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
