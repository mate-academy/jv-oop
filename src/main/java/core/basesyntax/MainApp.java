package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Machine[] machine = {excavator, truck, bulldozer};
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}

