package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
       Excavator excavator = new Excavator();
       Bulldozer bulldozer = new Bulldozer();
       Truck truck = new Truck();
        Machine [] machines = new Machine[]{excavator,bulldozer,truck};
        for(Machine itWork: machines){
            itWork.stopWork();
            itWork.doWork();
        }
    }
}
