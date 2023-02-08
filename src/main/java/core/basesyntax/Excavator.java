package core.basesyntax;

public class Excavator extends Machine{

  @Override
  public String doWork() {
     return "Excavator start work";

  }

  @Override
  public String stopWork() {
    return "Excavator stop work";
  }
}
