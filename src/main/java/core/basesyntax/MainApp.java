package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Створення об'єктів дочірніх класів
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        // Масив об'єктів типу Machine
        Machine[] machines = {truck, bulldozer, excavator};

        // Виклик методів doWork і stopWork для кожного об'єкта
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
