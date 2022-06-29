package core.basesyntax;

import com.sun.source.tree.NewArrayTree;

public class MainApp {
    public static void main(String[] args) {
        Machine  truck = new Truck();
        Machine  bulldozer = new Bulldozer();
        Machine  excavator = new Excavator();

        Machine[] machines = new Machine[] {truck, bulldozer, excavator};
          for (Machine machine : machines) {
              machine.doWork();
              machine.stopWork();
          }
    }
}




