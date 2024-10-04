package core.basesyntax;

public class MainAppTest {
    public static void main(String[] args) {

        Machine excavator = new Excavator();
        excavator.setName("excavator");

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("bulldozer");

        Machine truck = new Truck();
        truck.setName("truck");

        Machine[] machines = new Machine[]{excavator, bulldozer, truck};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}