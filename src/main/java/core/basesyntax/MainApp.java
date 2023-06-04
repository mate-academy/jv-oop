package core.basesyntax;

public class MainApp {
    
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] machines = new Machine[]{truck, bulldozer, excavator};
       
>>>>>>> master
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
