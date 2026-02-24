
public abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}
class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("A Truck started work");
    }
    @Override
    public void stopWork() {
        System.out.println("A Truck stopped work");
    }

}
class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("A Bulldozer started work");
    }
    @Override
    public void stopWork() {
        System.out.println("A Bulldozer stopped work");
    }

}
class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("An Excavator started work");
    }
    @Override
    public void stopWork() {
        System.out.println("An Excavator stopped work");
    }

}

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
            new Truck(),
            new Bulldozer(), 
            new Excavator()
        };
        for(Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
