package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] garage = new Machine[] {new Bulldozer(),new Excavator(),new Truck()};
        for (Machine work :garage) {
            work.doWork();
            work.stopWork();
        }

    }
}
