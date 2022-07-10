package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {new Truck(), new Excavator(), new Bulldozer()};
        for (Machine array : machine) {
            array.doWork();
            array.stopWork();
        }
    }
}
