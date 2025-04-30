package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] arrayMachine = new Machine[3];
        arrayMachine[0] = new Truck();
        arrayMachine[1] = new Bulldozer();
        arrayMachine[2] = new Excavator();

        for (Machine it : arrayMachine) {
            it.doWork();
            it.stopWork();
            System.out.println();
        }

    }
}
