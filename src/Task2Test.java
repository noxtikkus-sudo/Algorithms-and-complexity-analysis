import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    @ParameterizedTest
    @MethodSource("testData")
    void findMaxTest(int[] array, int expected) {
        assertEquals(expected, Task2.findMax(array, 0));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(new int[]{3, -1, 7, 2}, 7),
            Arguments.of(new int[]{-10, -5, -2, -100}, -2),
            Arguments.of(new int[]{42}, 42),
            Arguments.of(new int[]{1, 2, 3, 4, 5}, 5),
            Arguments.of(new int[]{10, 9, 8, 7}, 10)
        );
    }
}
