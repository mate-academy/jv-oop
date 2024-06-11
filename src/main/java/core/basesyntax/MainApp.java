package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        //Excavator excavator = new Excavator();
        //Bulldozer bulldozer = new Bulldozer();
        //Truck truck = new Truck();

        Object[] object = new Object[3];

        object[0] = new Excavator();
        object[1] = new Bulldozer();
        object[2] = new Truck();


        for (Object objects : object ) {
            //Excavator
            Excavator.doWork();
            Excavator.stopWork();
            //Bulldozer
            Bulldozer.doWork();
            Bulldozer.stopWork();
            //Truck
            Truck.doWork();
            Truck.stopWork();

        }

    }




}
