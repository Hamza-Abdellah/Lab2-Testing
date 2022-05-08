import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
public class evenandOddTest  {
    @Test
    public void isEven()

    {
        evenandOdd lab2 = new evenandOdd();
        assertEquals("even",lab2.evenOrOdd(6));
        assertEquals("odd",lab2.evenOrOdd(7));
    }
}