package core.basesyntax;

public class MainApp {
    static class Machine {
        public void doWork() {
            System.out.println("doWork");
        }

        public void stopWork() {
            System.out.println("stopWork");
        }
    }

    static class Truck extends Machine {
        public void doWork() {
            super.doWork();
        }

        public void stopWork() {
            super.stopWork();
        }
    }

    static class Bulldozer extends Machine {
        public void doWork() {
            super.doWork();
        }

        public void stopWork() {
            super.stopWork();
        }
    }

    static class Excavator extends Machine {
        public void doWork() {
            super.doWork();
        }

        public void stopWork() {
            super.stopWork();
        }
    }
}
