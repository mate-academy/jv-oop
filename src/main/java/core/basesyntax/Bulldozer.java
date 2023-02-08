package core.basesyntax;

public class Bulldozer extends Machine {
  @Override
  public String doWork() {
    return "Bulldozer start work";
  }

  @Override
  public String stopWork() {
    return "Bulldozer stop work";
  }

}
