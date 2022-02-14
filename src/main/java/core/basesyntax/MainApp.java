package core.basesyntax;
public class MainApp {
    public static void main(String[] args){
        //Create objects
        Machine cyberTruck = new Truck();
        cyberTruck.setTypeMachine("Cyber Truck");
        Machine buldCatD3 = new Bulldozer();
        buldCatD3.setTypeMachine("Bulldozer Cat D3");
        Machine excCat320D = new Excavator();
        excCat320D.setTypeMachine("Excavator Cat 320 D");
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
