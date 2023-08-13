package core.basesyntax;
/*Create class Machine containing methods public abstract void doWork() and public abstract void stopWork().
Create classes Truck, Bulldozer, Excavator that will inherit from Machine.
In those classes override doWork(), so it will print message that certain machine started its work.
Override stopWork() as well. It should print messages that certain machine stopped its work.
In MainApp class create Machine array with Truck, Bulldozer and Excavator and call methods doWork() and stopWork() in a loop.*/
public class MainApp {
    public static void main (String[] args) {
        Machine[] machinesArray = new Machine[3];
        machinesArray[0] = new Excavator();
        machinesArray[1] = new Bulldozer();
        machinesArray[2] = new Truck();
        for (int i = 0; i < 3; ++i) {
            machinesArray[i].doWork();
        }
        for (int i = 0; i < 3; ++i) {
            machinesArray[i].stopWork();
        }
    }

}

