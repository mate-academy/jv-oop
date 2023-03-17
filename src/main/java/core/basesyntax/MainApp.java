package core.basesyntax;

public class MainApp {
      public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine truck2 = new Truck();
        Machine[] machines = new Machine[] {
                truck, excavator, Bulldozer
        };

        for (Machine m : machines) {
            m.doWork();
        }
        
        for (Machine m : machines) {
            m.doStop();
        }
    }

}
