package core.basesyntax;
public abstract class Machine {
  public abstract void doWork();
  public abstract void stopWork();
}

public class Truck extends Machine {
  @Override
  public void doWork() {
    System.out.println("Truck started working.");
}
  @Override
  public void stopWork() {
    System.out.println("Truck stopped working.");
    } 
}

public class Bulldozer extends Machine {
  @Override
  public void doWork() {
    System.out.println("Bulldozer started working.");
  }
  @Override
  public void stopWork() {
    System.out.println("Bulldozer stopped working.");
     }
}


  
public class MainApp {

}
