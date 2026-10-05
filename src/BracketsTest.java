import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BracketsTest {

    @Test
    void testBaseCase() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Brackets.generateBrackets("", 0, 0, 1);
        System.setOut(originalOut);

        String actual = out.toString().trim().replace("\r\n", "\n");
        assertEquals("()", actual);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(int n, String expectedOutput) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Brackets.generateBrackets("", 0, 0, n);
        System.setOut(originalOut);

        String actual = out.toString().trim().replace("\r\n", "\n");
        assertEquals(expectedOutput, actual);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(1, "()"),
            Arguments.of(2, "(())\n()()"),
            Arguments.of(3, "((()))\n(()())\n(())()\n()(())\n()()()")
        );
    }
}
