package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[]{truck, bulldozer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
// Создайте класс Machine, содержащий методы public abstract void doWork() и public abstract void stopWork().
//Создайте классы Truck, Bulldozer, Excavator, которые будут наследоваться от Machine.
//В этих классах переопределяется doWork(), поэтому он будет печатать сообщение о том, что определенная машина начала свою работу.
//Также переопределить stopWork(). Он должен печатать сообщения о том, что определенная машина остановила свою работу.
//В основном классе создайте объект каждого класса.
//Запустите работу всех машин, а затем остановите их.