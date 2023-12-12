package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        Machine [] arrayMachine = new Machine[3];
        arrayMachine[0]=truck;
        arrayMachine[1]=excavator;
        arrayMachine[2]=bulldozer;

        for (Machine element : arrayMachine){
            element.doWork();
            element.stopWor();
        }

    }




}
