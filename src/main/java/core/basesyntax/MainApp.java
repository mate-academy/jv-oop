package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        Machine[] machines = {excavator, truck, bulldozer};

        int a = 0;

        do {
            machines[a].doWork();
            machines[a].stopWork();
            a++;
        } while (a < machines.length);

    }
}
