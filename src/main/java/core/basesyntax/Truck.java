package core.basesyntax;

public class Truck extends Machine {
    @Override
   public void stopWork() {
        System.out.println("Truck is finished");
    }

    @Override
   public void doWork() {
        System.out.println("Truck started working");
    }
}
