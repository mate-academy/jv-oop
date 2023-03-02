package core.basesyntax;
public class MainApp {
public void showWork() {
    Machine[] machineArray = {new Excavator(),new Truck(),new Bulldozer()};
    for (Machine machineNumber : machineArray) {
        machineNumber.doWork();
        machineNumber.stopWork();
    }
}
}
