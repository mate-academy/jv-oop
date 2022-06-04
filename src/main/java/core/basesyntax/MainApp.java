package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Bulldozer = new Bulldozer();
        Machine Truck = new Truck();
        Machine Excavator = new Excavator();
    Machine [] cor = new Machine[] {Bulldozer,Truck,Excavator};
       for(Machine machine: cor){
           machine.doWork();
           machine.stopWork();
       }
    }
}
