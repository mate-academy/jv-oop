package machine;

public class Machine {
    public void doWork() {

    }

    public void stopWork() {

    }

    public class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println("Truck has started working.");
        }

        @Override
        public void stopWork() {
            System.out.println("Truck has stopped working.");
        }
    }

    public class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Excavator has started working.");
        }

        @Override
        public void stopWork() {
            System.out.println("Excavator has stopped working.");
        }
    }

    public class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Bulldozer has started working.");
        }

        @Override
        public void stopWork() {
            System.out.println("Bulldozer has stopped working.");
        }
    }
}



