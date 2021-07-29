package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck ford = new Truck();
          ford.doWork();
          ford.stopWork();
        Bulldozer graider = new Bulldozer();
          graider.doWork();
          graider.stopWork();
        Excavator CAT = new Excavator();
        CAT.doWork();
        CAT.stopWork();
    }



}
