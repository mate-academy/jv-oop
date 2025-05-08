package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator(){
        };
        Machine bulldozer = new Bulldozer(){
        };
        Machine truck = new Truck(){
        };
        Machine[] machine = {excavator, bulldozer, truck};

        for (Machine status: machine) {
            status.doWork();
            status.stopWork();
        }
    }

}
