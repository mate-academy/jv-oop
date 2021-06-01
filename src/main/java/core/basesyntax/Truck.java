package core.basesyntax;

public class Truck extends Machine {
        @Override
        public void doWork() {
                System.out.println("Starting Truck: 1... 2... 3... Oooops, error:\"ratatatata\".");

        }

        @Override
        public void stopWork() {
                System.out.println("Fuel out. Truck is not working.");

        }

}
