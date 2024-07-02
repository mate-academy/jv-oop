package core.basesyntax;

class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck is starting its work");
    }
    public void stopWork() {
        System.out.println("Truck has stopped working");
    }
}
class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer is starting its work");
    }

    public void stopWork() {
        System.out.println("Bulldozer has stopped working");
    }
}
class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator is starting its work");
    }
    public void stopWork() {
        System.out.println("Excavator has stopped working");
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
