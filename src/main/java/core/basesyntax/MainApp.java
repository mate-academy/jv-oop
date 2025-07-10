package core.basesyntax;

abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();
}

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working(sadly)...");
    }
}

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working(sadly)...");
    }
}

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working(sadly)...");
    }
}

public class MainApp {
    public static void main(String[] args) {
        Machine[] arr = new Machine[3];
        arr[0] = new Truck();
        arr[1] = new Bulldozer();
        arr[2] = new Excavator();
        for (Machine machine : arr) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

