package core.basesyntax.Machines;

public class Bulldozer extends Machine {

  @Override
  public void doWork() {
    System.out.println("Bulldozer is bulldozing a building.");
  }
  @Override
  public void stopWork() {
    System.out.println("Bulldozer is no longer working");
  }
}
