package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Truck truck = new Truck();
    Excavator excavator = new Excavator();
    Bulldozer bulldozer = new Bulldozer();

    Machine[] autoParck = {truck, excavator, bulldozer};
    for (Machine machine : autoParck) {
      machine.doWork();
      machine.stopWork();
    }
  }
}
