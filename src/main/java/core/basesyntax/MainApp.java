package core.basesyntax;

public class MainApp {
    Machine[] machine = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
for (int i = 0;i < machine.length;i++) {
    machine[i].doWork();
    machine[i].stopWork();
}
}
