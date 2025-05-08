package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {new Excavator(), new Truck(), new Bulldozer()};
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}
