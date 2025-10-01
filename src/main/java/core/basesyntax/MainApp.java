package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine excavator = new Excavator();
    Machine bulldozer = new Bulldozer();
    Machine[] machines = {truck,excavator,bulldozer};

    public void Main(String args) {
        for (Machine i: machines) {
            i.doWork();
            i.stopWork();
        }
    }
}
