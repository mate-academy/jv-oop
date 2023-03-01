package core.basesyntax;
abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}
class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck started working");
    }
    public void stopWork() {
        System.out.println("Truck stopped working");
    }
}
class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer started working");
    }
    public void stopWork() {
        System.out.println("Bulldozer stopped working");
    }
}
class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator started working");
    }
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = { new Truck(), new Bulldozer(), new Excavator() };
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

