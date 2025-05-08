package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine firstCare = new Excavator();
        Machine secondCare = new Bulldozer();
        Machine thirdCare = new Truck();
        System.out.println(firstCare.doWork());
        System.out.println(secondCare.doWork());
        System.out.println(thirdCare.doWork());
        System.out.println(firstCare.stopWork());
        System.out.println(secondCare.stopWork());
        System.out.println(thirdCare.stopWork());
    }
}
