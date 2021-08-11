package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine man = new Truck("ManSe200", 12, 100);
        Machine caterpillar = new Bulldozer("CatD6", 5, 2);
        Machine caser = new Excavator("CaseCX80", 3, 11);
        Machine[] machines = new Machine[] {man, caterpillar, caser};

        for (Machine name : machines) {
            name.doWork();
        }
        for (Machine name : machines) {
            name.stopWork();
        }
    }
}
