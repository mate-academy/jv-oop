package core.basesyntax;

public class Bulldozer extends Machine {
  @Override
  public void doWork() {
    System.out.println("Bulldozer start it work");
  }

  @Override
  public void stopWork() {
    System.out.println("Bulldozer stop it work");
  }
}
