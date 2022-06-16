package core.basesyntax;

public class  MainApp {
    public static void main(String[] args){
    Machine excavator = new Excavator();
    excavator.nameMachine = "Excavator";
    Machine bulldozer = new Bulldozer();
    bulldozer.nameMachine = "Bulldozer";
    Machine truck = new Truck();
    truck.nameMachine = "Truck";
    String[] Machine = new String[]{"Truck", "Bulldozer", "Excavator"};
        for (String machineNow : Machine) {
            if(machineNow.equals(truck.nameMachine)){
                truck.doWork();
                truck.stopWork();
            } else if(machineNow.equals(bulldozer.nameMachine)) {
                bulldozer.doWork();
                bulldozer.stopWork();
            }else if(machineNow.equals(excavator.nameMachine)){
                excavator.doWork();
                excavator.stopWork();
            }
        }
}
}
