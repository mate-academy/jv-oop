package core.basesyntax;
public class MainApp {
  public static void main (String[] args ) {
    Machine bulldozer1 = new Bulldozer("650M");
    Machine truck1 = new Truck("TR260");
    Machine excavator1 = new Excavator("CX130D");
    Machine[] machines = new Machine[] {bulldozer1, truck1, excavator1};
      for (Machine machine : machines) {
        machine.doWork();
        machine.stopWork();
    }
  }
}
