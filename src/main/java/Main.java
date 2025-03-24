//Create class Machine containing methods public abstract void doWork() and public abstract void stopWork().
//Create classes Truck, Bulldozer, and Excavator that will inherit from Machine.
//In those classes override doWork(), so it will print a message that a certain machine started its work.
//Override stopWork() as well. It should print messages that certain machines stopped working.
//In the MainApp class create a Machine array with Truck, Bulldozer, and Excavator and call methods doWork() and stopWork() in a loop.
public class Main {
    public static void main(String[] args) {

        Machine[] machines = new Machine[]{
                new Track(),
                new Bulldozer(),
                new Excavator()
        };

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
            System.out.println();
        }
    }
}