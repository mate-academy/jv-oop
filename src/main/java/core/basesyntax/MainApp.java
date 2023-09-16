package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();


        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }

    }

}





    abstract class Machine {
        public abstract void doWork();
        public abstract void stopWork();

    }
     class Truck extends Machine {
        @Override
        public void doWork() {
            System.out.println("Driving a car do Work");
        }
        @Override
        public void stopWork() {
            System.out.println("Driving a car stop Work");
        }

    }
     class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Driving a car do Work");
        }
        @Override
        public void stopWork() {
            System.out.println("Driving a car stop Work");
        }

    }
     class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Driving a car do Work");
        }
        @Override
        public void stopWork() {
            System.out.println("Driving a car stop Work");
        }

    }


