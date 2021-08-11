package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine Man = new Truck("ManSe200", 12, 100);
    Machine Caterpillar = new Bulldozer("CatD6", 5, 2);
    Machine Case = new Excavator("CaseCX80", 3, 11);
    Machine[] Machine = new Machine[] {Man, Caterpillar, Case};

    for(int i = 0; i < Machine.length; i++) {
      Machine[i].doWork();
    }
    for(int i = 0; i < Machine.length; i++) {
      Machine[i].stopWork();
    }
  }
}
