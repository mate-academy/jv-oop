package core.basesyntax;

public class Excavator extends Machine {
        @Override
        public void doWork() {
                System.out.println("Starting Excavator: 1... 2... 3... Oooops, error:\"ratatatata\".");

        }

        @Override
        public void stopWork() {
                System.out.println("Fuel out. Excavator is not working.");


        }
}
