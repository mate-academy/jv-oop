package core.basesyntax;

public class  MainApp {
    public static void main(String[] args){
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        excavator.doWork();
        excavator.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
        truck.doWork();
        truck.stopWork();
    }
}
