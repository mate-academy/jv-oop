package core.basesyntax;

public class Bulldozer extends Machine {
        @Override
        public void doWork() {
                System.out.println("Starting Bulldozer: 1... 2... 3... Oooops, error:\"ratatatata\".");

        }

        @Override
        public void stopWork() {
                System.out.println("Fuel out. Bulldozer is not working.");


        }
}
