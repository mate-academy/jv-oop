package core.basesyntax;

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}
class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starts working");
    }
    @Override
    public void stopWork() {
        System.out.println("Truck stopped working");
    }
}
class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts working");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working");
    }
}
class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts working");
    }
    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.doWork();
        truck.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
        excavator.doWork();
        excavator.stopWork();
    }
}