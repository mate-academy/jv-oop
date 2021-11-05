package core.basesyntax;

public class MainApp {
    public static void main(String []args){
        Machine truck = new Truck();
     truck.setName("Volvo");
        Machine excavator = new Excavator();
     excavator.setName("Man");
        Machine bulldozer = new Bulldozer();
    bulldozer.setName("Audi");
    Machine[] machines = new Machine[] {truck, excavator, bulldozer};
        for (Machine machine : machines) {
     machine.doWork();
     machine.stopWork();
    }
}
}



