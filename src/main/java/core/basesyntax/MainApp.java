package core.basesyntax;

public class MainApp {
Machine[] machines = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};
for (int i = 0;i < machine.length;i++) {
    System.out.println(machine[i].doWork());
    System.out.println(machine[i].stopWork());
}
}
