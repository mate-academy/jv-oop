package core.basesyntax;

public class MainApp {
    public Machine[] getMachine() {
        Machine[] machine = new Machine[]{new Excavator(),new Bulldozer(),new Truck()};
        for (int i = 0;i < machine.length;i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
        return machine;
    }

}
