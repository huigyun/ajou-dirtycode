package ac.kr.ajou.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class StreamApiTest {

    @Test
    public void filterString_제대로_filter된_스트링을_반환() {
        StreamApi streamApi = new StreamApi();
        List<String> testStringList = new ArrayList<>();
        testStringList.add("abc");
        testStringList.add("abc");
        testStringList.add("abc2");
        testStringList.add("abc3");
        testStringList.add("abc4");

        List<String> result = streamApi.filterString(testStringList, "abc");
        assertTrue(result.size() == 2);
        assertTrue(result.get(0).equals("abc"));
        assertTrue(result.get(1).equals("abc"));
    }
}