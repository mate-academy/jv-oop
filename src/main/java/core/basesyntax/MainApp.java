package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine truck = new Truck();
    Machine excavator = new Excavator();
    Machine bulldozer = new Bulldozer();
    Machine[] machineArray = new Machine[]{truck, excavator, bulldozer};
    for (Machine machine : machineArray) {
      machine.doWork();
    }
    for (Machine machine : machineArray) {
      machine.stopWork();
    }
  }
}
