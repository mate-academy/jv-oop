package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine[] listOfMachines = {new Truck(),new Bulldozer(),new Excavator()};

        for (int i = 0; i < listOfMachines.length ; i++) {
            listOfMachines[i].doWork();
            listOfMachines[i].stopWork();
            System.out.println();
        }
    }
}
