package core.baseclasses;
  
public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(Truck.class.getSimpleName() + " now working");
    }

    @Override
    public void stopWork() {
        System.out.println(Truck.class.getSimpleName() + " now stopped");
    }
}
