package core.basesyntax;

public class Main {
        public static void main(String[] args) {
            Machine exc1 = new Excavator();
            Machine bull1 = new Bulldozer();
            Machine truck1 = new Truck();

            exc1.doWork();
            bull1.doWork();
            truck1.doWork();

            exc1.stopWork();
            bull1.stopWork();
            truck1.stopWork();
        }
    }

