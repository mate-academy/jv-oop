package core.basesyntax;

// Abstract class Machine
public abstract class Machine {
    // Abstract methods to be implemented by subclasses
    public abstract void doWork();
    public abstract void stopWork();
}

// Truck class inherits Machine and provides implementation of doWork and stopWork
class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working.");
    }
}

// Bulldozer class inherits Machine and provides implementation of doWork and stopWork
class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working.");
    }
}

// Excavator class inherits Machine and provides implementation of doWork and stopWork
class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working.");
    }
}

// MainApp class
public class MainApp {
    public static void main(String[] args) {
        // Create an array of Machine objects
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        // Loop through each machine and call doWork and stopWork methods
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
