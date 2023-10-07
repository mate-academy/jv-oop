package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Bulldozer();
        Machine[] allMachine = {excavator, bulldozer, truck};
        for (int i = 0; i < allMachine.length; i++) {
            allMachine[i].doWork();
            allMachine[i].stopWork();
        }
    }
}
