package core.basesyntax;

public class MainApp {
    public static void main(String[] args){
    Machine[] excavator = {new Excavator(),new Bulldozer(),new Truck()};
    for (int i = 0; i < excavator.length; i++) {
     excavator[i].doWork();
     excavator[i].stopWork();
     System.out.println(excavator[i].doWork() + "\n" + excavator[i].stopWork() + "\n");
    }
    }
}
