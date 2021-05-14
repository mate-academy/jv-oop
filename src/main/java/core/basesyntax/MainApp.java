package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
      Truck Alfa = new Truck();
      Bulldozer Beta = new Bulldozer();
      Excavator Gamma = new Excavator();

      Alfa.doWork();
      Beta.doWork();
      Gamma.doWork();

      Alfa.stopWork();
      Beta.stopWork();
      Gamma.stopWork();
    }
}
