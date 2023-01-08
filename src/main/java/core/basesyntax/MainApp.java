package core.basesyntax;
// abstract class
abstract class Machine {
  // abstract methods
  public abstract void doWork();
  public abstract void stopWork();
}
class Truck extends Machine {
  @Override
  public void doWork() {
    System.out.println(Truck.class.getSimpleName() + " now working");
  }

  @Override
  public void stopWork() {
    System.out.println(Truck.class.getSimpleName() + " now stopped");
  }
}
class Bulldozer extends Machine {
  @Override
  public void doWork() {
    System.out.println(Bulldozer.class.getSimpleName() + " now working");
  }

  @Override
  public void stopWork() {
    System.out.println(Bulldozer.class.getSimpleName() + " now stopped");
  }
}
class Excavator extends Machine {
  @Override
  public void doWork() {
    System.out.println(Excavator.class.getSimpleName() + " now working");
  }

  @Override
  public void stopWork() {
    System.out.println(Excavator.class.getSimpleName() + " now stopped");
  }
}
public class MainApp {
  public static void main(String args[]) {
    Machine[] machs = {
      new Truck(),
      new Bulldozer(),
      new Excavator()
    };
    for (Machine m: machs) {
      m.doWork();
      m.stopWork();
    }
  }

}
