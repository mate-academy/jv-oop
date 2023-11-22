package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayMachine = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : arrayMachine) {
            System.out.println("");
            machine.doWork();
            machine.stopWork();
            System.out.println("");
        }
    }
}
