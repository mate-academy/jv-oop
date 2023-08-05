

public class MainApp {
    public static void main(String[] args) {
       Excavator excavator = new Excavator();
       Bulldozer bulldozer = new Bulldozer();
       Truck truck = new Truck();

       Machine[] machine = new Machine[] {excavator, bulldozer, truck};

       for(Machine machinery : machine) {
           machinery.doWork();
           machinery.stopWork();
       }

        }
    }


