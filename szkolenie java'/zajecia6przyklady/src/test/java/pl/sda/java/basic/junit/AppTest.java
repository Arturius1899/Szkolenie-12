package pl.sda.java.basic.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
        // given
        App app = new App();
        // when
        boolean equals = app.equals(1);
        // then
        assertFalse( equals );
        assertEquals(1, 1);
    }

    @Test
    public void shouldAnswerWithTrue2()
    {
        // given
        App app = new App();
        // when
        boolean equals = app.equals(2);
        // then
        assertFalse( equals );
        assertEquals(1, 1);
    }
}
