import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator sut;
    @BeforeEach
    public void setUP(){
        sut = new Calculator();
    }
    @AfterEach
    public void tearDown(){
        sut = null;
    }
    @Test
    public void testPlus(){
        //arrange
        int a = 1, b = 2, expected = 3;
        //act
        int actual = sut.plus.apply(a,b);
        //assert
        assertThat(actual, Matchers.is(expected));

    }
    @Test
    public void testMinus(){
        //arrange
        int a = 2, b = 1, expected = 1;
        //act
        int actual = sut.minus.apply(a,b);
        //assert
        assertThat(actual, Matchers.is(expected));
    }
    @Test
    public void testMultiply(){
        //arrange
        int a = 2, b = 5, expected = 10;
        //act
        int actual = sut.multiply.apply(a,b);
        //assert
        assertThat(actual, Matchers.is(expected));
    }
    @Test
    public void testDivide(){
        //arrange
        int a = 10, b = 2, expected = 5;
        //act
        int actual = sut.divide.apply(a,b);
        //assert
        assertThat(actual, Matchers.is(expected));
    }
    @Test
    public void tessDivideByZero(){
        //arrange
        int a = 10, b = 0;
        //act and assert
        assertThrows(ArithmeticException.class, () -> sut.divide.apply(a, b));
    }
    @Test
    public void testPow(){
        //arrange
        int a = 2, expected = 4;
        //act
        int actual = sut.pow.apply(a);
        //assert
        assertThat(actual, Matchers.is(expected));
    }
    @Test
    public void testIsPositive(){
        //arrange
        int a = 2;
        //act and assert
        assertThat(a, greaterThan(0));
    }
}
