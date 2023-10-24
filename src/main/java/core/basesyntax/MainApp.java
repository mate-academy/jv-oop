package core.basesyntax;

public class MainApp {
    public static void main(String [] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machine = new Machine[]{ bulldozer, excavator, truck};
        for (Machine machine1 :machine) {
            machine1.doWork();
            machine1.stopWork();
        }
    }
}
