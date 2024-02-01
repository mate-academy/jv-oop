package core.basesyntax;
public class MainApp {
    public static void main(String [] args){
        Machine[] machines = new Machine[] { new Truck("RAM"), new Bulldozer("Caterpillar"),
                new Excavator("John Deere")};
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
