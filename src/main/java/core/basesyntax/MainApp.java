package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = { new Excavator(), new Bulldozer(), new Truck() };
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}
