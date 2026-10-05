import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTaskTest {

    @Test
    void testBaseCase() {
        assertEquals(10, FirstTask.money(10, -2, 0));
        assertEquals(3, FirstTask.money(3, 4, 0));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(int first, int difference, int n, int expected) {
        assertEquals(expected, FirstTask.money(first, difference, n));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(3, 4, 3, 15),
            Arguments.of(10, -2, 3, 4),
            Arguments.of(100, 10, 1, 110),
            Arguments.of(50, -5, 2, 40)
        );
    }
}
