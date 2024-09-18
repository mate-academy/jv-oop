package core.basesyntax;

public class MainApp {

    private Machine[] machines = {new Excavator(), new Truck(), new Bulldozer()};

    public void main() {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}

