package core.basesyntax;

public class MainApp {


  public static void Main() {

    Excavator excavator = new Excavator();
    Bulldozer bulldozer = new Bulldozer();
    Truck truck = new Truck();

    Machine [] machines = new Machine[] {truck, bulldozer, excavator};

    for (Machine machine: machines) {
      System.out.println(machine.doWork());
      System.out.println(machine.stopWork());
    }


  }
}
