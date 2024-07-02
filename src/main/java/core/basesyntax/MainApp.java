package core.basesyntax;

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}
class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck start");
    }
    public void stopWork() {
        System.out.println("Truck stop");
    }
}
class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer start");
    }

    public void stopWork() {
        System.out.println("Bulldozer stop");
    }
}
class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator start");
    }
    public void stopWork() {
        System.out.println("Excavator stop");
    }
}
public class MainApp {
    public static void main(String[] args) {
        Machine[] spisoc = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : spisoc) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
