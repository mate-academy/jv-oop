package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

    for (Machine machine : machines) {
      machine.doWork();
      machine.stopWork();
    }


    
  }

}

//In MainApp class create Machine array with Truck, Bulldozer and Excavator 
//and call methods doWork() and stopWork() in a loop.