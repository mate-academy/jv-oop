package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
  public static void main(String[] args) {
	ArrayList<Machine> objectsOfMachine = new ArrayList<>();
	objectsOfMachine.add(new Bulldozer());
	objectsOfMachine.add(new Excavator());
	objectsOfMachine.add(new Truck());
	for (Machine el : objectsOfMachine) {
	  el.doWork();
	  el.stopWork();
	}
  }
}
