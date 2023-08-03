package core.basesyntax;

public class MainApp {
  abstract class Machine {
      public abstract void doWork();
      public abstract void stopWork();
  }

  class Track extends Machine {
    @Override
    public void doWork() {
      System.out.println("Truck begun working.");
    } 

    @Override
    public void stopWork() {
      System.out.println("Truck stopped working.");
    }
  }

  class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer begun working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working.");
    }
  }

  class Excavator extends Machine {
    @Override
    public void doWork() {
      System.out.println("Excavator begun working.");
    }

    @Override
    public void stopWork() {
      System.out.println("Excavator stopped working.");
    }
  }

  Track newTrack = new Track();
  Bulldozer newBulldozer = new Bulldozer() ;
  Excavator newExcavator = new Excavator();

  Machine[] machines = {  newTrack, newBulldozer, newExcavator };

  for (Machine machine : machines) {
    machine.doWork();
    machine.stopWork();
  }
}
