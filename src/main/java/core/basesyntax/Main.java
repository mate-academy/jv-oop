package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] machine = new Machine[3];
        machine[0] = new Truck();
        machine[1] = new Excavator();
        machine[2] = new Bulldozer();
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}
