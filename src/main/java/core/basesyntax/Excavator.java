package core.basesyntax;

public class Excavator extends Machine {
    @Override
  public  String doWork() {
    return "The excavator started to work";
    }
    @Override
    public String stopWork() {
    return "The excavator has finished working";
  }
}
