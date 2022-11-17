package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String stopWork() {
    return "The truck has finished working";
    }
    @Override
    public String doWork() {
    return "The truck started to work";
  }
}
