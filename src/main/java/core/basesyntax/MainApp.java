package core.basesyntax;

public class MainApp {
    public class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println("Truck started its work");

        }

        @Override
        public void stopWork() {
            System.out.println("Truck stopped working");
        }

    }

    public class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Bulldozer started its work");

        }

        @Override
        public void stopWork() {
            System.out.println("Bulldozer stopped working");
        }

    }

    public class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Excavator started its work");

        }

        @Override
        public void stopWork() {
            System.out.println("Excavator stopped working");
        }
    }

}
