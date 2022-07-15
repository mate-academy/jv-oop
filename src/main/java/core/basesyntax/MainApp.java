package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine[] workMachine = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};
    for(Machine machine : workMachine) {
      machine.doWork();
      machine.stopWork();
    }
  }

}
