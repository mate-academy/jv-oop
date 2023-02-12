package core.basesyntax;

public class MainApp {

    public static void main(String[] args){
        Machine  truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine  excavator = new Excavator();

        Machine [] machines = {truck, bulldozer, excavator};

        for (int i = 0; i < machines.length; i++) {
        machines[i].doWork();
        machines[i].stopWork();

        }
    }
}
