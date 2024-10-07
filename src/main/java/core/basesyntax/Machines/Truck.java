package core.basesyntax.Machines;

public class Truck extends Machine{
  @Override
  public void doWork() {
    System.out.println("Truck is shipping cargo.");
  }
  @Override
  public void stopWork() {
    System.out.println("Truck has finished it's work");
  }
}
