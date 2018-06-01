
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ScrabbleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ScrabbleTest
{
    @Test
    public void testMBCP(){
        Scrabble scrabble = new Scrabble();    
        int expected = 8;

        int actual = scrabble.score("Banana");

        Assert.assertEquals(expected, actual);
    }

}
