package core.basesyntax;

public class MainApp {
   public static void main(String[] args) {
     Excavator excavator = new Excavator();
     Bulldozer bulldozer = new Bulldozer();
     Truck truck = new Truck();

     Machine[] workers = {excavator, bulldozer, truck};

     for (Machine currentMachine : workers) {
        currentMachine.doWork();
        currentMachine.stopWork();
     }
   }
}
