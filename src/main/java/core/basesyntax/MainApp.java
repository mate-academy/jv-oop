package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        String[] matrixMachine = {truck.goWork(),bulldozer.goWork(),excavator.goWork(),
                truck.stopWork(), bulldozer.stopWork(), excavator.stopWork()};

        for (String matrix : matrixMachine) {
            System.out.println(matrix);
        }
    }
}
