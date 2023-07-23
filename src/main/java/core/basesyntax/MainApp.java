package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine[] array = {truck, bulldozer, excavator};

        for (Machine machine : array) {
            machine.doWork();
            machine.stopWork();
            System.out.println("----------------");
        }

    }

}
