package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machine = new Machine[] {truck, bulldozer, excavator};
                for (Machine mashuna:machine){
                    mashuna.doWork();
                    mashuna.stopWork();
                }
    }
}





