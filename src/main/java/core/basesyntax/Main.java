package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        //Creating objects of Machine type using child's classes constructors
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        //Initialize machines'
        bulldozer.setName("bulldozer1");
        truck.setName("truck1");
        excavator.setName("excavator1");
        //Creating Machine array with our machines
        Machine[] machine = new Machine[3];
        machine[0] = truck;
        machine[1] = bulldozer;
        machine[2] = excavator;
        //Calling methods doWork() and stopWork in a loop
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}
