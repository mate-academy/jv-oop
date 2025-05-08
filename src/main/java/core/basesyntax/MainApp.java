package core.basesyntax;

public class MainApp {
    private Machine truck = new Truck();
    private Machine bulldozer = new Bulldozer();
    private Machine excavator = new Excavator();

    public void main(String[] args) {
        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();

        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}

