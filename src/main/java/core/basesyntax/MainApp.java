package core.basesyntax;

public class MainApp {
    public static void main(String [] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        excavator.setEngine(" Excavator started ");
        truck.setEngine(" Truck started ");
        bulldozer.setEngine(" Bulldozer started ");
        System.out.println(excavator.getEngine());
        System.out.println(truck.getEngine());
        System.out.println(bulldozer.getEngine());
        System.out.println("------------------");

        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();

        excavator.setEngine("Excavator stopped ");
        truck.setEngine("Truck stopped ");
        bulldozer.setEngine("Bulldozer stopped ");

        System.out.println("-------------------");
        System.out.println(excavator.getEngine());
        System.out.println(truck.getEngine());
        System.out.println(bulldozer.getEngine());
        System.out.println("-------------------");

        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
    }
}
