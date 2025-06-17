package core.basesyntax;

public class MainApp {
    Machine[] arrayMachines = {new Truck(), new Bulldozer(), new Excavator()};
    for (Machine obj: arrayMachines) {
        obj.doWork();
        obj.stopWork();
  }
}
