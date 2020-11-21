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
                {"you can't handle the truth"},
                {"we will we will rock you"},
                {"you and i i and you"},
                {"how are you"},
                {"me me me me me"}
        };
        for (int i = 0; i < input.length; i++) {
            String n1 = new String();
            for (int j = 0; j < input[i].length; j++) {
                n1 = (input[i][j]);
            }
            HashMap<String, Integer> actual = HandleTruth.wordCount(n1);
            ArrayList<HashMap<String, Integer>> expected = getHashMapTest();
            assertEquals(expected.get(i), actual);
        }
    }

    private ArrayList<HashMap<String, Integer>> getHashMapTest() {
        ArrayList<HashMap<String, Integer>> expected = new ArrayList<>();

        HashMap<String, Integer> n1 = new HashMap<>();
        n1.put("the", 1);
        n1.put("truth", 1);
        n1.put("handle", 1);
        n1.put("can't", 1);
        n1.put("you", 1);
        expected.add(n1);

        HashMap<String, Integer> n2 = new HashMap<>();
        n2.put("we", 2);
        n2.put("will", 2);
        n2.put("rock", 1);
        n2.put("you", 1);
        expected.add(n2);

        HashMap<String, Integer> n3 = new HashMap<>();
        n3.put("and", 2);
        n3.put("i", 2);
        n3.put("you", 2);
        expected.add(n3);

        HashMap<String, Integer> n4 = new HashMap<>();
        n4.put("how", 1);
        n4.put("are", 1);
        n4.put("you", 1);
        expected.add(n4);

        HashMap<String, Integer> n5 = new HashMap<>();
        n5.put("me", 5);
        expected.add(n5);

        return expected;
    }
}