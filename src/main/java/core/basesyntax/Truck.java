package core.basesyntax;

public class Truck extends Machine {
  @Override
  public void doWork() {
    System.out.println("The truck has started work");
  }

  @Override
  public void stopWork() {
    System.out.println("The truck has stopped work");
  }
}
