package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine machine[] = new Machine[3];
        machine[0] = new Excavator();
        machine[1] = new Truck();
        machine[2] = new Bulldozer();
        for (int i = 0; i < 3; i++) {
            machine[i].doWork();
        }
        for (int i = 0; i < 3; i++) {
            machine[i].stopWork();
        }
    }

}
