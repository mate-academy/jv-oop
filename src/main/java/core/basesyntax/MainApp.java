package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();
    Machine[] user = {truck, bulldozer, excavator};

    public void doWorks() {
        for (Machine users: user) {
            users.doWork();
            users.stopWork();
        }
    }
}
