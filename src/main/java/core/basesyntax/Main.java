package core.basesyntax;

public class Main {
    public static void main(String[] args){

        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for ( Machine mash : machines ) {
            mash.doWork();
            mash.stopWork();
        }
    }

}
