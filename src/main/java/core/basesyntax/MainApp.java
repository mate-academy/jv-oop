package core.basesyntax;

// Abstract class Machine
abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}

// Truck class
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

// Bulldozer class
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

// Excavator class
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
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        // Call the doWork() and stopWork() methods on each machine
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
            System.out.println(); // Add a newline for readability
        }
    }
}
