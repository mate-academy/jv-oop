public class Truck extends Machine {
    public abstract void doWork() {
        System.out.println("The truck has started to work!");
    }
    public abstract void stopWork() {
        System.out.println("The truck has stopped work!");
    }
}
