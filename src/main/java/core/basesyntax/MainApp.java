package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine volvo = new Truck();
        Machine cat = new Bulldozer();
        Machine belaz = new Excavator();

        for (int i = 0; i < 3; i++) {
            System.out.println(volvo.doWork());
            System.out.println(volvo.stopWork());
            System.out.println(cat.doWork());
            System.out.println(cat.stopWork());
            System.out.println(belaz.doWork());
            System.out.println(belaz.stopWork());
        }
    }
}
