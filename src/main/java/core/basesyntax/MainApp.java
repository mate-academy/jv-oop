package core.basesyntax;

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}

class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working");
    }
}

class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working");
    }
}

class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}


public class MainApp {
    public static void main(String[] args){
        Machine [] machines = new Machine[] {
                new Bulldozer(),
                new Truck(),
                new Excavator()
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
