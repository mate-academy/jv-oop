package main.java.core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        new Truck();
        new Buldozer();
        new Excavator();

        Machine.startAllMachines();
        Machine.stopAllMachines();
    }
}
