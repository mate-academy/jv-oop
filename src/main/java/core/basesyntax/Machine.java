abstract class Machine {
  public abstract void doWork();
  public abstract void stopWork();
 }
class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck started its work.");
    }
    public void stopWork() {
        System.out.println("Truck has stopped working.");
    }
}
