package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine mechTruck = new Truck();
    Machine mechBulldozer = new Bulldozer();
    Machine mechExcavator = new Excavator();

    Machine[] machines = {mechTruck, mechBulldozer, mechExcavator};
    for (Machine machine : machines) {
        machine.doWork();
        machine.stopWork();
    }
  }
}