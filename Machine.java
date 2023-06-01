package core.basesyntax;

public class Machine {
    public void doWork(){
    }
    public void stopWork(){
    }
    public static class Truck extends Machine {
        @java.lang.Override
        public void doWork() {
            System.out.println("Truck started work");
        }
        @java.lang.Override
        public void stopWork() {
            System.out.println("Truck stopped work");
        }
    }
    public static class Bulldozer extends Machine {
        @java.lang.Override
        public void doWork() {
            System.out.println("Bulldozer started work" );
        }
        @java.lang.Override
        public void stopWork() {
            System.out.println("Bulldozer stopped work");
        }
    }
    public static class Excavator  extends Machine {
        @java.lang.Override
        public void doWork() {
            System.out.println("Excavator  started work" );
        }
        @java.lang.Override
        public void stopWork() {
            System.out.println("Excavator stopped work");
        }
    }






}




