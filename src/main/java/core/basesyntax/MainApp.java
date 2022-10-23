package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine[] carPark = new Machine[3];
        carPark[0] = new Truck ();
        carPark[1] = new Bulldozer();
        carPark[2] = new Excavator();

        for (Machine workingMachine : carPark) {
            workingMachine.doWork();
            workingMachine.stopWork();
            System.out.println();
        }
    }
}