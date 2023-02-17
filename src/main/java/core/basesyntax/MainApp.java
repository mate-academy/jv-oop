package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine[] machine = {truck, bulldozer, excavator};

        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }

}
