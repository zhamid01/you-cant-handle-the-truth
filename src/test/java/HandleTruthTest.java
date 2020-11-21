import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String[][] input = {
                {"you can't handle the truth"}
        };
        /*
        HashMap<String, Integer>[][] expected = {
                {"the, truth, handle, can't, you", 1}
        };
        */
        for (int i = 0; i < input.length; i++) {
            String n1 = new String();
            for (int j = 0; j < input[i].length; j++) {
                n1 = (input[i][j]);
            }
            HashMap<String, Integer> actual = HandleTruth.wordCount(n1);
            HashMap<String, Integer> expected = getHashMapTest();
            assertEquals(expected, actual);
        }
    }

    private HashMap<String, Integer> getHashMapTest() {
        HashMap<String, Integer> testCases = new HashMap();

        testCases.put("the", 1);
        testCases.put("truth", 1);
        testCases.put("handle", 1);
        testCases.put("can't", 1);
        testCases.put("you", 1);

        return testCases;
    }
}