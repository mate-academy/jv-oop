package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine firstMachine = new Truck();
        Machine secondMachine = new Bulldozer();
        Machine thirdMachine = new Excavator();

        firstMachine.doWork();
        secondMachine.doWork();
        thirdMachine.doWork();
        firstMachine.stopWork();
        secondMachine.stopWork();
        thirdMachine.stopWork();
    }

}
