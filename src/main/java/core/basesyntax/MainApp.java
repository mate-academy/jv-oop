package core.basesyntax;

import core.basesyntax.Transport.Bulldozer;
import core.basesyntax.Transport.Excavator;
import core.basesyntax.Transport.Truck;

public class MainApp {
  public static void main(String[] args) {
    Machine truck = new Truck();
    Machine excavator = new Excavator();
    Machine bulldozer = new Bulldozer();
    Machine[] machines = new Machine[] {truck, excavator, bulldozer};
    for (Machine machine : machines) {
      machine.doWork();
      machine.stopWork();
      System.out.println(); // Split one machine from another;
    }
  }
}
