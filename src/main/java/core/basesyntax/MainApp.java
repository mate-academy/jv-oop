package core.basesyntax;

abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();
}

abstract class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work");
    }
}

abstract class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work");
    }
}

abstract class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped its work");
    }
}

public class MainApp {
  public static void main(String[] args) {
      Machine bulldozer = new Bulldozer() {
          @Override
          public void doWork() {
              super.doWork();
          }

          @Override
          public void stopWork() {
              super.stopWork();
          }
      };
      Machine truck = new Truck() {
          @Override
          public void doWork() {
              super.doWork();
          }

          @Override
          public void stopWork() {
              super.stopWork();
          }
      };
      Machine excavator = new Excavator() {
          @Override
          public void doWork() {
              super.doWork();
          }

          @Override
          public void stopWork() {
              super.stopWork();
          }
      };
      Machine[] machines = {bulldozer, truck, excavator};
      for (Machine machine : machines) {
          machine.doWork();
          machine.stopWork();
      }
  }
}
