package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozerOne = new Bulldozer();
        Machine excavatorOne = new Excavator();
        bulldozerOne.doWork();
        bulldozerOne.stopWork();
        excavatorOne.doWork();
        excavatorOne.stopWork();
    }
}
