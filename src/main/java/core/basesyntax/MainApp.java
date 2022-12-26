package core.basesyntax;

public class MainApp {
    Truck truck = new Truck();
    Bulldozer bulldozer = new Bulldozer();
    Excavator excavator = new Excavator();
    Machine [] machines = {truck,bulldozer,excavator};

    for(Machine machine: machines) {
        System.out.println(machine.stopWork());
        System.out.println(machine.doWork());
    }

    public class Machine {
        public abstract void doWork() {

        }

        public abstract void stopWork() {

        }
    }

    public class Truck extends Machine {
        @Override
        public abstract void doWork() {
            return "Truck started its work";
        }
        @Override
        public abstract void stopWork() {
            return "BulTruckldozer stoped its work";
        }
    }
    public class Bulldozer extends Machine {
        @Override
        public abstract void doWork() {
            return "Bulldozer started its work";
        }
        @Override
        public abstract void stopWork() {
            return "Bulldozer stoped its work";
        }
    }

    public class Excavator extends Machine {
        @Override
        public abstract void doWork() {
            return "Excavator started its work";
        }
        @Override
        public abstract void stopWork() {
            return "Excavator stoped its work";
        }
    }
}
