package core.basesyntax;
  public class MainApp {
  public static void main(String[] args) {
      Machine truck = new Truck();
      Machine bulldozer = new Bulldozer();
      Machine excavator = new Excavator();
      Machine[] technique = new Machine[] {truck, bulldozer, excavator};
      for (Machine machine: technique) {
        machine.doWork();
        machine.stopWork();
      }
    }
  }

  /* SECOND CODE OPTION ON THIS PAGE MainApp

    public class MainApp {
    public static void main(String[] args) {}

    String[] Machine = new String[] {"Truck", "Bulldozer", "Excavator"};
      public void doWork() {
      for (String technique: Machine) {
        doWork();
      }
    }
    public void stopWork() {
      for (String technique: Machine) {
         stopWork();
      }
    }
  }
*/