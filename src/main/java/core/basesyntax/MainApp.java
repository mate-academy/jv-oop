package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] arrayOfMachine = new Machine[]{new Buldozer(), new Excavator(), new Truck()};
        for (Machine machines : arrayOfMachine) {
            machines.doWork();
            machines.stopWork();
        }
    }
}
