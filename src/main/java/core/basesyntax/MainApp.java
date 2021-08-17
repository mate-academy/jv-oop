package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        //Start
        excavator.doWork();
        truck.doWork();
        bulldozer.doWork();

        //Stop
        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
    }

}
