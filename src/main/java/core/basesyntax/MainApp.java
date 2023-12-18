package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine comatsu = new Bulldozer();
        Machine liebherr = new Excavator();
        Machine caterpillar = new Truck();

        Machine[] arrayOfMachines = new Machine[] {comatsu, liebherr, caterpillar};
        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
