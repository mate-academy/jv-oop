package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine excavator = new Excavator("excavator");
        Machine bulldozer = new Bulldozer("bulldozer");
        Machine truck = new Truck("truck");

        Machine[] machines = new Machine[] {excavator, bulldozer, truck};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
