package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        for (Machine machine : new Machine[]{ new Truck(), new Bulldozer(), new Excavator() }) {
            machine.doWork();
            machine.stopWork();
        }
    }

    public abstract static class Machine {
        public abstract void doWork();

        public abstract void stopWork();
    }

    public static class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println("Machine Truck has started");
        }

        @Override
        public void stopWork() {
            System.out.println("Machine Truck has stopped it's work");
        }
    }

    public static class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Machine Bulldozer has started");
        }

        @Override
        public void stopWork() {
            System.out.println("Machine Bulldozer has stopped it's work");
        }
    }

    public static class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Machine Excavator has started");
        }

        @Override
        public void stopWork() {
            System.out.println("Machine Excavator has stopped it's work");
        }
    }
}
