package core.basesyntax;
abstract class Machine {
    public abstract void doWork();  
    public abstract void stopWork();
}
public class Track extends Machine {
  @Override
    pulic void doWork() {
      System.out.println("Track do work!");
  @Override
    pulic void stopWork() {
      System.out.println("Track stop work!");    
}
public class Bulldoser extends Machine {
  @Override
    pulic void doWork() {
      System.out.println("Bulldoser do work!");
  @Override
    pulic void stopWork() {
      System.out.println("Bulldoser stop work!");    
} 
public class Excavator extends Machine {
  @Override
    pulic void doWork() {
      System.out.println("Excavator do work!");
  @Override
    pulic void stopWork() {
      System.out.println("Excavator stop work!");    
}      
public class MainAppTest {
  public static void main(String[] args) {
    Bulldoser bulldoser = new Bulldoser();
    Truck truck = new Truck();
    Excavator excavator = new Excavator();
  bulldoser.doWork();
  truck.doWork();
  excavator.doWork();
  bulldoser.stopWork();
  truck.stopWork();
  excavator.stopWork();  
}
}
