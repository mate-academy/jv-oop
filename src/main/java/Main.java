import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Excavator(), new Bulldozer()};
        Arrays.stream(machines).forEach(machine -> {machine.doWork(); machine.stopWork();});
    }
}
