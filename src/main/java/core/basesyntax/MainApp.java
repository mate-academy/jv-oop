package core.basesyntax;


public class MainApp {
    public static abstract class Machine {
        public abstract void doWork();
        public abstract void stopWork();
    };
    public static class Truck extends Machine{
        @Override 
        public void doWork() {
            System.out.println("Truck started its work");
    }
    @Override 
        public void stopWork() {
            System.out.println("Truck stopped its work");
    }
}
    
    public static class Bulldozer extends Machine{
        @Override 
        public void doWork() {
            System.out.println("Bulldozer started its work");
    }
    @Override 
        public void stopWork() {
            System.out.println("Bulldozer stopped its work");
    }
    }
    public static class Excavator extends Machine{
        @Override 
        public void doWork() {
            System.out.println("Excavator started its work");
    }
    @Override 
        public void stopWork() {
            System.out.println("Excavator stopped its work");
    }
    }

    public static void main(String[] args) {
        Machine[] cars = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine car: cars) {
            car.doWork();
            car.stopWork();
        }
    }
}
