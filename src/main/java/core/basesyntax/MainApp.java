package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Excavator(), new Truck(), new Bulldozer()};

        for (Machine elem: machines) {
            elem.doWork();
            elem.stopWork();
        }
    }
}
