package core.basesyntax;

public abstract class Machine {
    public abstract void doWork();



    public abstract void stopWork();

    }




    /*Создайте класс Machine, содержащий методы public абстрактного void doWork() и public абстрактного void stopWork().
        Создайте классы Truck, Bulldozer, Excavator, которые будут наследоваться от Machine.
        В этих классах функция doWork() переопределяется, поэтому она выводит сообщение о том, что определенная машина
        начала свою работу.
        Также переопределите stopWork(). Он должен вывести сообщения о том, что определенная машина прекратила свою работу.
        В классе MainApp создайте массив Machine с Truck, Bulldozer и Excavator и вызовите методы doWork() и stopWork() в цикле.*/