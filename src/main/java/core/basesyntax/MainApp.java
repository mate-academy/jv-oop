package core.basesyntax;

public class MainApp {
 Machine [] machines = { new Truck(), new Bulldozer(), new Excavator()};
 for(int i = 0; i < machines.length; i++ ){
 Machine machine = machines[i];
  System.out.println(machine.doWork() + machine.stopWork(););
 }
}
