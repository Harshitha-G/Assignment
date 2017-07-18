import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by harshitha.g on 7/18/2017.
 */
public class HelloWorldTest
{
    private HelloWorld h;
    @Before
    public void setup() throws Exception
    {
        h = new HelloWorld();
    }
    @Test
    public void TestHelloworld()
    {
        assertEquals( h.getName(),"harshitha");
        assertEquals( h.getMessage(),"hello harshitha!");
    }
    @Test
    public void TestHello()
    {
        h.setName("World");
        assertEquals(h.getName(),"World");
        assertEquals(h.getMessage(),"hello World!");

    }

}