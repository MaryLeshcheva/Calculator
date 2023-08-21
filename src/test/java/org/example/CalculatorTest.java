package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculatorTest {
    private static Calculator calculator;
    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    public void testSummation() {
        int result = 0;

        try {
            result = calculator.summation(2, 2);
        } catch (InterruptedException exception) {
            Assertions.fail();
        }

        Assertions.assertEquals(4, result, "Ошибка! Не работает сложение");
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtraction(2, 2);
        Assertions.assertEquals(0, result, "Ошибка! Не работает вычитание");
    }

    @Test
    public void testDivision() {
        int result = calculator.division(6, 3);
        Assertions.assertEquals(2, result, "Ошибка! Не работает деление");
    }

    @Test
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Assertions.assertThrows(
            ArithmeticException.class,
            () -> {
                calculator.division(6, 0);
            },
            "Ошибка! Деление на 0 не привело к выбрасыванию исключения ArithmeticException"
        );
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiplication(2, 4);
        Assertions.assertEquals(8, result, "Ошибка! Не работает умножение");
    }

}