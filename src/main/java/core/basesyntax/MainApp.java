package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Excavator = new Excavator();
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine[] machines = {Excavator,Truck,Bulldozer};
        for(Machine working : machines){
            working.doWork();
            working.stopWork();
        }
        System.out.println();
    }
}
