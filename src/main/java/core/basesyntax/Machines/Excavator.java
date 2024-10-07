package core.basesyntax.Machines;

public class Excavator extends Machine{

  @Override
  public void doWork() {
    System.out.println("Excavator is excavating something.");
  }

  @Override
  public void stopWork() {
    System.out.println("Excavator has stopped excavating.");
  }

}
