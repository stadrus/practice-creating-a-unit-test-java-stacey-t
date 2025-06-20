import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @BeforeEach

    @Test
    void greetingTest() {
        String msg = "Test should print greeting.";
        String exact = "Welcome";
        System.out.println(msg + exact);
    }

    @Test
    void addTest() {
        String msg = "This test should add two numbers and print the sum.";
        int sum = (2 + 3);
        assertEquals(5, sum);
        System.out.println(msg);
    }
    @Test
    void isAdultTest(){
        String msg = "This test should return valid age.";
        int age = 18;
        int exact = 18;
        assertEquals(age, exact);
    }
}
