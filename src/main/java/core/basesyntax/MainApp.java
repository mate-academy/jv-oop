package core.basesyntax;
public class MainApp {
    public static void main(String[] args){
        Machine cyberTruck = new Truck();
        cyberTruck.setTypeMachine("Cyber Truck");
        Machine BuldCatD3 = new Bulldozer();
        BuldCatD3.setTypeMachine("Buldozer Cat D3");
        Machine ExcCat320D = new Excavator();
        ExcCat320D.setTypeMachine("Excavator Cat 320 D");

    }

}
