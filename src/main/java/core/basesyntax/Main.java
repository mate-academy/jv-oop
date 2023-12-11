package org.example;
<<<<<<< HEAD

=======
>>>>>>> bfc333a38b4e40cd6b46160c94c29037effa7b0b
public class Main {
    public static void main(String[] args) {
        Machine[] machines = { new Truck(), new Bulldozer(), new Excavator() };

        for (Machine car: machines) {
            car.doWork();
            car.stopWork();
            System.out.println(); }
    }
}