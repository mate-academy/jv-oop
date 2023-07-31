package core.basesyntax;

public class MainApp {
    Machine[] machine = {new Bulldozer(), new Excavator(), new Truck()};

    public void run() {
        for (int i=0; i <= machine.length; i++){
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}
