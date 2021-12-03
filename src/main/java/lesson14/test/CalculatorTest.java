package lesson14.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.stream.Stream;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void startUp() {
        System.out.println("Начинается тест");
        calculator = new Calculator();
    }

    @AfterEach
    void shutdown() {
        System.out.println("Тест завершен");
    }

    @BeforeAll
    static void mainStart() {
        System.out.println("MAIN START!");
    }

    @AfterAll
    static void mainEnd() {
        System.out.println("MAIN END!");
    }

    @DisplayName("Сложение 3 и 4")
    @Test
    void testAdd1() {
        Assertions.assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void testAdd2() {
        Assertions.assertEquals(7, calculator.add(3, 3));
    }

    @Test
    void testAdd3() {
        Assertions.assertEquals(234234234, calculator.add(45354345, 34534534));
    }

    @DisplayName("Проверка исключения")
    @Test
    void testDivE() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(8, 0));
    }

    @DisplayName("Тест на время испольняния и сложения")
    @Test
    void testTimeout() {
       Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
//           Thread.sleep(4000);
           Assertions.assertEquals(4, calculator.add(3, 2));
       });
    }

    @DisplayName("Параметризированный тест")
    @ParameterizedTest
    @MethodSource("data")
    void paramTest(int expected, int a, int b) {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
            Assertions.assertEquals(expected, calculator.add(a, b));
        });
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(3, 1, 2),
                Arguments.arguments(6, 3, 2),
                Arguments.arguments(-1, -2, 1),
                Arguments.arguments(0, Integer.MAX_VALUE, Integer.MIN_VALUE),
                Arguments.arguments(Integer.MIN_VALUE, 1, Integer.MAX_VALUE),
                Arguments.arguments(-5, -2, -3)
        );
    }
}