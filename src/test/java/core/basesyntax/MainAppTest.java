package core.basesyntax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainAppTest {

    private Bulldozer bulldozer;
    private Truck truck;
    private Excavator excavator;

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @Before
    public void setUp() {
        bulldozer = new Bulldozer();
        truck = new Truck();
        excavator = new Excavator();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void bulldozerShouldWorkCorrectly() {
        bulldozer.doWork();
        bulldozer.stopWork();

        String output = normalizeLineSeparators(outputStream.toString());
        String expectedOutput = "Bulldozer started its work\nBulldozer stopped working\n";
        assertEquals("Bulldozer output should match the expected output.", expectedOutput, output);
    }

    @Test
    public void truckShouldWorkCorrectly() {
        truck.doWork();
        truck.stopWork();

        String output = normalizeLineSeparators(outputStream.toString());
        String expectedOutput = "Truck started its work\nTruck stopped working\n";
        assertEquals("Truck output should match the expected output.", expectedOutput, output);
    }

    @Test
    public void excavatorShouldWorkCorrectly() {
        excavator.doWork();
        excavator.stopWork();

        String output = normalizeLineSeparators(outputStream.toString());
        String expectedOutput = "Excavator started its work\nExcavator stopped working\n";
        assertEquals("Excavator output should match the expected output.", expectedOutput, output);
    }

    @After
    public void tearDown() {
        System.setOut(originalSystemOut);
    }

    private String normalizeLineSeparators(String text) {
        return text.replace(System.lineSeparator(), "\n");
    }
}
