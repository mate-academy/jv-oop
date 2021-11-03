package core.basesyntax;

public class MainApp {
        public static void main(String []args){
    Machine truck = new Truck();
    truck.setName("Volvo");
    truck.doWork();
    truck.stopWork();

    Machine excavator = new Excavator();
    truck.setName("Man");
    truck.doWork();
    truck.stopWork();

    Machine bulldozer = new Bulldozer();
    truck.setName("Audi");
    truck.doWork();
    truck.stopWork();
}
    }


