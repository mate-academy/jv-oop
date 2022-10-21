package core.basesyntax;

import classes.Bulldozer;
import classes.Excavator;
import classes.Machine;
import classes.Truck;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Machine[] autoPark = {new Truck("Kraz", 250, 18.5), //Machine array with random info
                new Bulldozer("John Deer", 450, 25),
                new Excavator("Volvo", 380, 521)};

        for (Machine machine: autoPark) { // calling method doWork
            machine.doWork();
            Thread.sleep(1000);
        }

        for (int i = 0; i < 3; i++) { // pause between doWork and stopWork:
            System.out.print("."); // output "."
            Thread.sleep(500); // every 0.5 seconds
        }

        System.out.println("\n");

        for (Machine machine: autoPark) { // calling method stopWork
            machine.stopWork();
            Thread.sleep(1000);
        }
    }
}
