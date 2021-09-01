package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // create a Truck object
        Truck truck = new Truck();
        truck.setName("DAF");

        // create a Bulldozer object
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName("CAT");

        // create a Excavator object
        Excavator excavator = new Excavator();
        excavator.setName("ЄКГ");

        //machines started working
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        // machines stopped working
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
