import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {

    @ParameterizedTest
    @MethodSource("testData")
    void generateBracketsTest(int n, String expectedOutput) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Task3.generateBrackets("", 0, 0, n);

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
