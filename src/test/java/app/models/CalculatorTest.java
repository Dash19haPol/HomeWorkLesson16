package app.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void adding() {
        int firstNumber = 6;
        int secondNumber = 1;

        assertEquals(firstNumber + secondNumber, calculator.adding(firstNumber, secondNumber));
    }

    @Test
    void subtracting() {
        int firstNumber = 6;
        int secondNumber = 1;
        assertEquals(firstNumber - secondNumber, calculator.subtracting(firstNumber, secondNumber));
    }

    @Test
    void multiplication() {
        int firstNumber = 6;
        int secondNumber = 1;
        assertEquals(firstNumber * secondNumber, calculator.multiplication(firstNumber, secondNumber));
    }

    @Test
    void division() {
        int firstNumber = 6;
        int secondNumber = 1;
        assertEquals(firstNumber / secondNumber, calculator.multiplication(firstNumber, secondNumber));
    }

}