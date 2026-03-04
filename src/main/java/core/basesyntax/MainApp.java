package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] machineList = new Machine[3];

        machineList[0] = new Truck();
        machineList[1] = new Buldozer();
        machineList[2] = new Excavator();

        for (Machine temporary : machineList) {
            temporary.doWork();
            temporary.stopWork();
        }
    }
}
