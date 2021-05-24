package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        HelloController sc = new HelloController();
        String expected = sc.index();
        String actual = "taro desu!";
        assertEquals(expected, actual);
    }
}
