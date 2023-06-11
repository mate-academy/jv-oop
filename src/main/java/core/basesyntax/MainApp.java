package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] newMachine = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : newMachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck Start to Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck Stop Working");
    }
}

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer Start to Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer Stop Working");
    }
}

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator Start to Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator Stop Working");
    }
}