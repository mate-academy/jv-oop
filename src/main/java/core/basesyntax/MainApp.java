package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] autoPark = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : autoPark) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
