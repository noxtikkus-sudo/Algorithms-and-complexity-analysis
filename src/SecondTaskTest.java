import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondTaskTest {

    @Test
    void testBaseCase() {
        int[] singleElement = {42};
        assertEquals(42, SecondTask.findMax(singleElement, 0));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(int[] array, int expected) {
        assertEquals(expected, SecondTask.findMax(array, 0));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(new int[]{3, -1, 7, 2}, 7),
            Arguments.of(new int[]{-10, -5, -2, -100}, -2),
            Arguments.of(new int[]{1, 2, 3, 4, 5}, 5),
            Arguments.of(new int[]{10, 9, 8, 7}, 10)
        );
    }
}
