package core.basesyntax;

public class MainApp {
    private static Machine truck = new Truck();
    private static Machine bulldozer = new Bulldozer();
    private static Machine excavator = new Excavator();
    private static Machine[] machine = {truck, bulldozer, excavator};

    public static void main(String[] args) {
        for (Machine machine : machine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

