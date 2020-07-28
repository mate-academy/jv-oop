package core.basesyntax;

/**
 * - Создать класс Machine с методами public abstract void doWork()
 * и public abstract void stopWork().
 * - Создать классы Track, Bulldozer, Excavator которые унаследуют Machine.
 * - Переопределить метод doWork() и вывести в консоль строку с сообщением что та или иная
 * машина начала свою работу.
 * - Переопределить метод stopWork() и вывести в консоль строку с сообщением что та или иная
 * машина прекратила свою работу.
 * - В классе Main создать добавить по одному экземпляру каждого класса.
 * - Отправить все машины на работу и остановить работу всех машин.
 */
public class MainApp {
    public static void main(String[] args) {

        Bulldozer bulldozer =
                new Bulldozer(125, 300, true, 22);
        Excavator excavator =
                new Excavator(124, 400, true, true);
        Truck truck =
                new Truck(560, 1200, true, 10);

        Machine[] machines = new Machine[]{bulldozer, excavator, truck};
        for (Machine machine : machines) {
            machine.doWork();
        }

        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
