package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };
        for (Machine machine : machines) {
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
            System.out.println("Вантажівка почала роботу.");
        }

        @Override
        public void stopWork() {
            System.out.println("Вантажівка зупинила роботу.");
        }
    }

    public static class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Бульдозер почав роботу.");
        }

        @Override
        public void stopWork() {
            System.out.println("Бульдозер зупинив роботу.");
        }
    }

    public static class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Екскаватор почав роботу.");
        }

        @Override
        public void stopWork() {
            System.out.println("Екскаватор зупинив роботу.");
        }
    }
}
