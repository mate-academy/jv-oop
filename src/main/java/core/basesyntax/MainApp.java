package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] mashines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine mashine : mashines) {
            mashine.doWork();
            mashine.stopWork();
        }
    }

}
