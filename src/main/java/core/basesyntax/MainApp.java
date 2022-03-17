package core.basesyntax;

public class MainApp {
    public static void main(String[] args){
        Truck ford = new Truck();
        Bulldozer volvo = new Bulldozer();
        Excavator alsoCat = new Excavator();
        // Starting
        ford.doWork();
        volvo.doWork();
        alsoCat.doWork();
        // Stopping
        ford.stopWork();
        volvo.stopWork();
        alsoCat.stopWork();
    }

}
