package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
  public void doWork() {
        System.out.println("it's a Bulldozer that works");
    }

    @Override
  public void stopWork() {
        System.out.println("is a Bulldozer that does not work");
    }
}
