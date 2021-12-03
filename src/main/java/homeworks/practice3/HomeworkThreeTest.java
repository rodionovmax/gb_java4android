package homeworks.practice3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HomeworkThreeTest {

    private HomeworkThree hm3;

    @BeforeEach
    void startUp() {
        System.out.println("Test starts");
        hm3 = new HomeworkThree();
    }

    @DisplayName("Проверка баланса в массиве")
    @Test
    void testCheckBalanceInArray() {
        assertTrue(hm3.checkBalanceInArray(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        assertFalse(hm3.checkBalanceInArray(new int[]{2, 2, 0, 0, 3}));
        assertFalse(hm3.checkBalanceInArray(new int[]{3, 5}));

    }

    @DisplayName("Проверка баланса в массиве используя параметризированный тест")
    @ParameterizedTest
    @MethodSource("data")
    void testParamCheckBalanceInArray(boolean expected, int[] arr) {
        assertThat(expected, is(hm3.checkBalanceInArray(arr)));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(true, new int[]{2, 2, 2, 1, 2, 2, 10, 1}),
                Arguments.arguments(true, new int[]{1, 1, 1, 2, 1}),
                Arguments.arguments(false, new int[]{4, 10, 2, 5, 10})
        );
    }

    @DisplayName("Проверка сдвига массива")
    @Test
    void testShiftArray() {
        Assertions.assertArrayEquals(new int[]{6, 1, 3, 5}, hm3.shiftArrayVarTwo(new int[]{3, 5, 6, 1}, -2));
        Assertions.assertArrayEquals(new int[]{3, 1, 2}, hm3.shiftArrayVarTwo(new int[]{1, 2, 3}, 1));
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 3}, hm3.shiftArrayVarTwo(new int[]{3, 5, 6, 1}, 3));
    }

    @DisplayName("Проверка сдвига массива используя параметризированный тест")
    @ParameterizedTest
    @MethodSource("dataTwo")
    void testParamShiftArray(int[] expected_arr, int[] arr, int n) {
        Assertions.assertArrayEquals(expected_arr, hm3.shiftArrayVarTwo(arr, n));
    }

    static Stream<Arguments> dataTwo() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 0),
                Arguments.arguments(new int[]{5, 1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5}, 1),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 2000000000),
                Arguments.arguments(new int[]{5, 6, 7, 0, 1, 2, 3, 4}, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 3),
                Arguments.arguments(new int[]{2, 3, 4, 5, 1}, new int[]{1, 2, 3, 4, 5}, -6),
                Arguments.arguments(new int[]{2, 3, 4, 5, 1}, new int[]{1, 2, 3, 4, 5}, -1)
        );
    }
}
