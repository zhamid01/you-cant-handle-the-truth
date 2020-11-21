import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        /* String[][] input = {
                //{"son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to\";"}
                {"you can't handle the truth"}
        };
        int[][] expected = {
                {the=1, truth=1, handle=1, can't=1, you=1}
        };
        for (int i = 0; i < input[i].length; i++) {
            HashMap<String, Integer> actual = HandleTruth.wordCount(input[i]);
          */
        HashMap<String, Integer> actual = HandleTruth.wordCount("you can't handle the truth");
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("the", 1);
        expected.put("truth", 1);
        expected.put("handle", 1);
        expected.put("can't", 1);
        expected.put("you", 1);
        assertEquals(expected, actual);
    }
}