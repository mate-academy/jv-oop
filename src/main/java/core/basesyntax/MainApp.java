package core.basesyntax;
public class MainApp {

    public static void main(String[] args) {
        String[] machine = {"Truck", "Bulldozer", "Excavator"};
        for (int i = 0; i < machine.length; i++) {
            Machine work = new Machine(){
                @Override
                public void doWork() {
                    System.out.println("Start work");
                }
                @Override
                public void stopWork() {
                    System.out.println("Stop work");
                }
            };
        }
    }
}
