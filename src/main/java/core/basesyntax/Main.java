package core.basesyntax;

public class Main {
    public static void main(String[] agrs) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine[] machines = new Machine[] {excavator, bulldozer, truck};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
