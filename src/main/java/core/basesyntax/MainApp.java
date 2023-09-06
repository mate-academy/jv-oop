package core.basesyntax;

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work");
    }
}

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work");
    }
}

class Excavator extends Machine {
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
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}