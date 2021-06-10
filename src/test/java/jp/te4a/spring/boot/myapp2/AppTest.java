package jp.te4a.spring.boot.myapp2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
