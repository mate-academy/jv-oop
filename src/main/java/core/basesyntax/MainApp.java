package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] user = {truck, bulldozer, excavator};

        for (Machine users: user) {
            users.doWork();
            users.stopWork();
        }
    }
}

