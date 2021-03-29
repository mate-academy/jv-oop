package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine[]machines = {truck,bulldozer,excavator};

        for (int i = 0; i < machines.length; i++) {
            for (int j = 0; j < machines.length; j++) {
                if (i > 0) {
                    break;
                } else {
                    machines[j].doWork();
                }
            }
            machines[i].stopWork();
        }
    }
}
