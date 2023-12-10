package core.basesyntax;

/**
 * - Создать класс Machine с методами public abstract void doWork()
 * и public abstract void stopWork().
 * - Создать классы Track, Bulldozer, Excavator которые унаследуют Machine.
 * - Переопределить метод doWork() и вывести в консоль строку с сообщением что та или иная
 * машина начала свою работу.
 * - Переопределить метод stopWork() и вывести в консоль строку с сообщением что та или иная
 * машина прекратила свою работу.
 * - В классе Main создать добавить по одному екземпляру каждого класса.
 * - Отправить все машини на работу и остановить работу всех машин.
 */
public class MainApp {
    private Machine buldozer = new Bulldozer();
    private Machine excavator = new Excavator();
    private Machine truck = new Truck();

    private Machine[] machines = {buldozer, excavator, truck};

    private void result(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();

        }
    }

}
