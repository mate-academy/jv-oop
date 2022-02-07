package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }

    public class Machine {
        public abstract void doWork();
        public abstract void stopWork();

    }
    public class Truck extends Machine {
        @java.lang.Override
        public void doWork() {
            System.out.println("Truck was started to work");
        }
        @java.lang.Override
        public void stopWork() {
            System.out.println("Truck was stopped to work");
        }
    }
    public class Bulldozer extends Machine {
        @java.lang.Override
        public void doWork() {
            System.out.println("Bulldozer was started to work");
        }
        @java.lang.Override
        public void stopWork() {
            System.out.println("Bulldozer was stopped to work");
        }
    }
    public class Excavator extends Machine {
        @java.lang.Override
        public void doWork() {
            System.out.println("Excavator was started to work");
        }
        @java.lang.Override
        public void stopWork() {
            System.out.println("Excavator was stopped to work");
        }
    }
}
