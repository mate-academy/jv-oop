package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] array = new Machine[] { new Bulldozer(), new Truck(), new Excavator()};
        for (Machine m : array){
            m.doWork();
            m.stopWork();
        }
    }
}
