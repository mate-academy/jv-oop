package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();
    Machine[] workMachine = new Machine[] {truck, bulldozer, excavator};
    for(Machine machine : workMachine) {
      machine.doWork();
    }
    for(Machine machine : workMachine) {
      machine.stopWork();
    }
  }

}
