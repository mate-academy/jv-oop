package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] machine = new Machine[] {truck, bulldozer, excavator};
        for (int i = 0; i < 3; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}



