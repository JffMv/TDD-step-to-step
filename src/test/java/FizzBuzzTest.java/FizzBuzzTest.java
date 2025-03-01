import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
    @Test
    void testFizzBuzzMultiplo3() {
    assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
    }

    @Test
    void testFizzBuzzMultiplo5() {
    assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    assertEquals("Buzz", FizzBuzz.fizzbuzz(100));
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(90));
    }
}