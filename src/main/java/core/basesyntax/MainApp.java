package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] allMachine = new Machine[]{new Excavator(),new Bulldozer(),new Truck()};

        for (int a = 0;a < allMachine.length;a++) {
            allMachine[a].doWork();
            allMachine[a].stopWork();
        }

    }
}
