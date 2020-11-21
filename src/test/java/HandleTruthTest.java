import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HashMap<String, Integer> actual = HandleTruth.wordCount("you can't handle the truth");
        HashMap<String, Integer> expected = getHashMapTest();
        assertEquals(expected, actual);
        actual = HandleTruth.wordCount("we will we will rock you");
        expected = getHashMapTest();
        assertEquals(expected, actual);
        actual = HandleTruth.wordCount("you and I I and you");
        expected = getHashMapTest();
        assertEquals(expected, actual);
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