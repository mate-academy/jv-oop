package core.basesyntax;

import core.basesyntax.cars.Bulldozer;
import core.basesyntax.cars.Excavator;
import core.basesyntax.cars.Machine;
import core.basesyntax.cars.Track;

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
    public static void main(String[] args) {
        Machine[] cars = {new Excavator(), new Bulldozer(), new Track()};

        for (Machine car : cars) {
            car.doWork();
        }

        for (Machine car : cars) {
            car.stopWork();
        }
    }
}
