package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine[] array = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine item: array) {
            item.doWork();
            item.stopWork();
        }
    }
}
