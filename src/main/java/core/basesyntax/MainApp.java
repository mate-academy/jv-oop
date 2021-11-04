package core.basesyntax;

public class MainApp {
    public static void main(String []args){

    Machine truck = new Truck();
    truck.setName("Volvo");
    truck.doWork();
    truck.stopWork();

    Machine excavator = new Excavator();
    excavator.setName("Man");
    excavator.doWork();
    excavator.stopWork();

    Machine bulldozer = new Bulldozer();
    bulldozer.setName("Audi");
    bulldozer.doWork();
    bulldozer.stopWork();
}
    }


