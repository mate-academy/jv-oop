package core.basesyntax;

public class MainApp {

public static void main(String[] args){

    Buldozer buldozer = new Buldozer();
    Excavator excavator = new Excavator();
    Truck truck = new Truck();


    Machines[] Machines = new Machines[]{buldozer, truck, excavator};
    for (int i = 0; i < Machines.length; i++) {
        String printStart = Machines[i].doWork();
        String printStop = Machines[i].stopWork();
        System.out.println(printStart);
        System.out.println(printStop);
    }

}
}
