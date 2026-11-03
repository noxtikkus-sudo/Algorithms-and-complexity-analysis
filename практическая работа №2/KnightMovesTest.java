import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class KnightMovesTest {

    @Test
    void testBaseCase() {
        assertEquals(2, KnightMoves.countMoves("a1"));
        assertFalse(KnightMoves.isWhiteSquare("a1"));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(String square, int expectedMoves, boolean isWhite) {
        assertEquals(expectedMoves, KnightMoves.countMoves(square));
        assertEquals(isWhite, KnightMoves.isWhiteSquare(square));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of("e4", 8, true),
            Arguments.of("b1", 3, false),
            Arguments.of("h8", 2, false)
        );
    }
}
