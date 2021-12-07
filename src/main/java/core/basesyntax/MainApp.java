package core.basesyntax;

abstract class Machine {

    public abstract void doWork();

    public abstract void stopWork();
}

    class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println("Machine started its work");
        }
        @Override
        public void stopWork() {
            System.out.println("Machine stopped its work");
        }
    }
    class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Machine started its work");
        }
        @Override
        public void stopWork() {
            System.out.println("Machine stopped its work");
        }
    }
    class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Machine started its work");
        }
        @Override
        public void stopWork() {
            System.out.println("Machine stopped its work");
        }
    }



