public abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();
}
class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck do work");
    }
    public void stopWork() {
        System.out.println("Truck stop work");
    }
}
class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer do work");
    }
    public void stopWork() {
        System.out.println("Bulldozer stop work");
    }
}
class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator do work");
    }
    public void stopWork() {
        System.out.println("Excavator stop work");
    }
}