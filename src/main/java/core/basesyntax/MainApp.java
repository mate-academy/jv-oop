package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine caterpillar = new Excavator();
          caterpillar.doWork();
          caterpillar.stopWork();
        Machine graider = new Bulldozer();
          graider.doWork();
          graider.stopWork();
        Machine ford = new Truck();
          ford.doWork();
          ford.stopWork();
    }

}
