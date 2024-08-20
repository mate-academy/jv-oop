package core.basesyntax;

public class MainApp {

  Machine excavator = new Excavator();
  Machine bulldozer = new Bulldozer();
  Machine truck = new Truck();
  Machine[] machines = new Machine[] {excavator, bulldozer, truck};
  public void getMachineCond() {


    for (Machine machine: machines) {
      machine.doWork();
      machine.stopWork();
    }
  }

}
