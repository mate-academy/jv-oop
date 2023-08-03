package core.basesyntax;


public class MainApp {

    public static void main(String[] args) {
        Machine[] machine = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine i : machine) {
            i.doWork();
        }
        for (Machine i : machine) {
            i.stopWork();
        }
    }

}
