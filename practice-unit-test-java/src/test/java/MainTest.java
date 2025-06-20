import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @BeforeEach

    @Test
    void mainTest() {
        String msg = "Test should print greeting.";
        String exact = "Welcome";
        System.out.println(msg + exact);
    }
//    @Test
//    void namesTest(){
//        ArrayList<String> names = new ArrayList<>();
//        String msg = "This test should print an array of names added to names.";
//        ArrayList<String> expected = names.add("John");
//        ArrayList<String> actual = ["John", "Jane"];
//        assertEquals(msg, expected, actual);
//    }



//    @Test
//    void addIntTest(int x, int y){
//        String msg = "This test should add two numbers and print the sum.";
//        Main addInt = new Main;
//        int sum = addInt.add(2,3);
//        assertEquals(5,sum);
//



}
