import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @ParameterizedTest
    @MethodSource("testData")
    void moneyTest(int first, int difference, int n, int expected) {
        assertEquals(expected, Task1.money(first, difference, n));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(3, 4, 3, 15),
            Arguments.of(10, -2, 3, 4),
            Arguments.of(10, -2, 0, 10),
            Arguments.of(100, 10, 1, 110),
            Arguments.of(50, -5, 2, 40)
        );
    }
}
