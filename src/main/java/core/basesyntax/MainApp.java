package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine[] machine = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine value : machine) {
            value.doWork();
        }
        Machine[] machine1 = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine value : machine1) {
            value.stopWork();
        }
    }
}

   /*Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();*/
