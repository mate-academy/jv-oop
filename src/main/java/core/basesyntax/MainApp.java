package core.basesyntax;

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped work.");
    }
}

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped work.");
    }
}

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped work.");
    }
}

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
        }

        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}