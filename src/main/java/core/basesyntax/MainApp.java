package core.basesyntax;

import core.basesyntax.Machines.Bulldozer;
import core.basesyntax.Machines.Excavator;
import core.basesyntax.Machines.Machine;
import core.basesyntax.Machines.Truck;

public class MainApp {
  public static void main(String[] args) {

    Truck truck = new Truck();
    Excavator excavator = new Excavator();
    Bulldozer bulldozer = new Bulldozer();

    Machine[] machines = {truck, excavator, bulldozer};

    for(Machine element : machines) {
      element.doWork();
      element.stopWork();
    }
  }
}
