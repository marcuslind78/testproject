package marcuslind78.testproject;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lind on 2015-02-21.
 */
public class TestStreams extends TestCase {

    public void testStreams() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "x123", "c54", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
