package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine man1742 = new Truck();
        man1742.doWork();
        man1742.stopWork();

        Machine kat1890 = new Excavator();
        kat1890.doWork();
        kat1890.stopWork();

        Machine kat1516 = new Bulldozer();

        kat1516.doWork();
        kat1516.stopWork();
    }
}
