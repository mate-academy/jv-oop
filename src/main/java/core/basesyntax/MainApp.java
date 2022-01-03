package core.basesyntax;

import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Machine;
import core.basesyntax.models.Track;
import java.util.List;

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
        Machine track = new Track();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        List<Machine> machineList = List.of(track, bulldozer, excavator);
        machineList.forEach(Machine::doWork);
        machineList.forEach(Machine::stopWork);
    }
}
