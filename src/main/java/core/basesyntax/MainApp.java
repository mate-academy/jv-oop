package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Machine[] machines = {excavator, truck, bulldozer};
        for (Machine machine:machines){
            machine.doWork();
            machine.stopWork();
        }
    }
}
