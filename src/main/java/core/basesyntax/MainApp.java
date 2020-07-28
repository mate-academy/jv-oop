package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Track;
import core.basesyntax.model.Machine;

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
        Machine myTrack = new Track();
        Machine myBulldozer = new Bulldozer();
        Machine myExcavator = new Excavator();

        myTrack.doWork();
        myBulldozer.doWork();
        myExcavator.doWork();

        myTrack.stopWork();
        myBulldozer.stopWork();
        myExcavator.stopWork();
    }
}
