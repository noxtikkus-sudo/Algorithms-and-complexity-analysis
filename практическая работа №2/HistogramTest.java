import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HistogramTest {

    @Test
    void testBaseCase() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Histogram.printHistogram(new int[]{1});
        System.setOut(originalOut);

        String actual = out.toString().trim().replace("\r\n", "\n");
        assertEquals("*", actual);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(int[] values, String expectedOutput) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Histogram.printHistogram(values);
        System.setOut(originalOut);

        String actual = out.toString().trim().replace("\r\n", "\n");
        assertEquals(expectedOutput, actual);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(new int[]{2, 4}, "**\n****"),
            Arguments.of(new int[]{3, 1}, "***\n*")
        );
    }
}
