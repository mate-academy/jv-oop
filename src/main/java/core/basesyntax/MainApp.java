package core.basesyntax;

public class MainApp {
 public static  void main(String[]  args){

     Machine [] machinLisl = {new Truck(), new Bulldozer(), new Excavator()};
     for (Machine machine : machinLisl){
         machine.doWork();
         machine.stopWork();
     }
 }
}