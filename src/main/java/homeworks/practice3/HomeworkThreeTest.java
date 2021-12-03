package homeworks.practice3;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HomeworkThreeTest {

    private HomeworkThree hm3;

    @BeforeAll
    public static void setLogger() {
        PropertyConfigurator.configure("src/main/resources/logs/configs/log4j.properties");
    }


    @BeforeEach
    void startUp() {
        System.out.println("Test starts");
        hm3 = new HomeworkThree();
    }

    @DisplayName("Проверка баланса в массиве используя параметризированный тест")
    @ParameterizedTest
    @MethodSource("data")
    void testParamCheckBalanceInArray(boolean expected, int[] arr) {

        Logger fileTask7 = Logger.getLogger("fileTask7");
        fileTask7.info("Test started");

        assertThat(expected, is(hm3.checkBalanceInArray(arr)));

        fileTask7.info("Test finished");
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(true, new int[]{2, 2, 2, 1, 2, 2, 10, 1}),
                Arguments.arguments(false, new int[]{1, 1, 1, 2, 1}),
                Arguments.arguments(false, new int[]{4, 10, 2, 5, 10})
        );
    }

    @DisplayName("Проверка сдвига массива используя параметризированный тест")
    @ParameterizedTest
    @MethodSource("dataTwo")
    void testParamShiftArray(int[] expected_arr, int[] arr, int n) {

        Logger fileTask8 = Logger.getLogger("fileTask8");
        fileTask8.info("Test started");

        Assertions.assertArrayEquals(expected_arr, hm3.shiftArrayVarTwo(arr, n));

        fileTask8.info("Test finished");
    }

    static Stream<Arguments> dataTwo() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 0),
                Arguments.arguments(new int[]{5, 1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5}, 1),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 2000000000),
                Arguments.arguments(new int[]{5, 6, 7, 0, 1, 2, 3, 4}, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 3),
                Arguments.arguments(new int[]{2, 3, 4, 5, 1}, new int[]{1, 2, 3, 4, 5}, -6),
                Arguments.arguments(new int[]{2, 3, 4, 5, 1}, new int[]{1, 2, 3, 4, 5}, -1),
                Arguments.arguments(new int[]{6, 1, 3, 5}, new int[]{3, 5, 6, 1}, -2),
                Arguments.arguments(new int[]{3, 1, 2}, new int[]{1, 2, 3}, 1),
                Arguments.arguments(new int[]{5, 6, 1, 3}, new int[]{3, 5, 6, 1}, 3)
        );
    }
}
