package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bull = new Bulldozer();
        Machine ex = new Excavator();
        Machine tru = new Truck();

        Machine[] machine = new Machine[3];
        machine[0] = bull;
        machine[1] = ex;
        machine[2] = tru;

        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }

    }

}

