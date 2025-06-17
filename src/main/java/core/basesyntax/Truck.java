public class Truck extends Machine {
  @Override
  void doWork() {
    System.out.println("Truck started work.");
  }
  @Override
  void stopWork() {
    System.out.println("Truck stopped working.");
  }  
}
  
