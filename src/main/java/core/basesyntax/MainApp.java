package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = new Machine[3];
        machine[0] = new Truck();
        machine[1] = new Bulldozer();
        machine[2] = new Excavator();

        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }

}
