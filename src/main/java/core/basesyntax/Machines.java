package core.basesyntax;

public abstract class Machines {
    public static class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println("Truck started its work");
    }
        @Override
        public void stopWork() {
            System.out.println("Truck stopped working");
        }
    }

    public static class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Bulldozer started its work");
        }
        @Override
        public void stopWork() {
            System.out.println("Bulldozer stopped working");
        }
    }

    public static class Excavator extends Machine {
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


