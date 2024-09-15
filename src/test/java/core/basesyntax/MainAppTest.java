package core.basesyntax;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainAppTest {

    private Bulldozer bulldozer;
    private Truck truck;
    private Excavator excavator;

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    void setUp() {
        bulldozer = new Bulldozer();
        truck = new Truck();
        excavator = new Excavator();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void bulldozerShouldWorkCorrectly() {
        bulldozer.doWork();
        bulldozer.stopWork();

        String output = normalizeLineSeparators(outputStream.toString());
        String expectedOutput = "Bulldozer started its work\nBulldozer stopped working\n";
        assertEquals(expectedOutput, output, "Bulldozer output should match the expected output.");
    }

    @Test
    void truckShouldWorkCorrectly() {
        truck.doWork();
        truck.stopWork();

        String output = normalizeLineSeparators(outputStream.toString());
        String expectedOutput = "Truck started its work\nTruck stopped working\n";
        assertEquals(expectedOutput, output, "Truck output should match the expected output.");
    }

    @Test
    void excavatorShouldWorkCorrectly() {
        excavator.doWork();
        excavator.stopWork();

        String output = normalizeLineSeparators(outputStream.toString());
        String expectedOutput = "Excavator started its work\nExcavator stopped working\n";
        assertEquals(expectedOutput, output, "Excavator output should match the expected output.");
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalSystemOut);
    }

    private String normalizeLineSeparators(String text) {
        return text.replace(System.lineSeparator(), "\n");
    }
}
