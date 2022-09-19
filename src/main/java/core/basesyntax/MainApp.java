package core.basesyntax;

public class MainApp {
    public static void main(String[] args){
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Machine[] machines = {truck, bulldozer, excavator};
        for (int i = 0; i< machines.length; i++){
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
