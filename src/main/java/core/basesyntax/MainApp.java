package core.basesyntax;

public class MainApp {

    private static final Machine[] machines = new Machine[]{new Truck(),
            new Bulldozer(), new Excavator()};

    public static void main(String[] args) {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }

}
