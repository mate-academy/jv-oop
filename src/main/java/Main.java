public class Main {
    public static void main(String[] args) {
        Machine volvo = new Truck();
        Machine caterpillar = new Excavator();
        Machine cat = new Bulldozer();
        volvo.doWork();
        caterpillar.doWork();
        cat.doWork();
        volvo.stopWork();
        caterpillar.stopWork();
        cat.stopWork();
    }
}
