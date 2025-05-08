package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        //Create objects
        Machine cyberTruck = new Truck();
        Machine buldCatD3 = new Bulldozer();
        Machine excCat320D = new Excavator();
        //Machines start
        cyberTruck.doWork();
        buldCatD3.doWork();
        excCat320D.doWork();
        //Machines stop
        cyberTruck.stopWork();
        buldCatD3.stopWork();
        excCat320D.stopWork();
    }
}
