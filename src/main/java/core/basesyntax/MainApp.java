package core.basesyntax;

// using abstract class

public class MainApp {

    abstract class Machine {
        // abstract methods
        public abstract void doWork();

        public abstract void stopWork();
    }

    class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println(Truck.class.getSimpleName() + " now working");
        }

        @Override
        public void stopWork() {
            System.out.println(Truck.class.getSimpleName() + " now stopped");
        }
    }

    class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println(Bulldozer.class.getSimpleName() + " now working");
        }

        @Override
        public void stopWork() {
            System.out.println(Bulldozer.class.getSimpleName() + " now stopped");
        }
    }

    class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println(Excavator.class.getSimpleName() + " now working");
        }

        @Override
        public void stopWork() {
            System.out.println(Excavator.class.getSimpleName() + " now stopped");
        }
    }

    public static void main(String[] args) {
        MainApp mo = new MainApp();
        MainApp.Machine[] machs = new MainApp.Machine[3];
        machs[0] = mo.new Truck();
        machs[1] = mo.new Bulldozer();
        machs[2] = mo.new Excavator();
        for (MainApp.Machine m: machs) {
            m.doWork();
            m.stopWork();
        }
    }
}
