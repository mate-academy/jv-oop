package core.basesyntax;

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped working.");
    }
}

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped working.");
    }
}

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped working.");
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

