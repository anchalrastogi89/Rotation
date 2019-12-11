package Game.Rotation;

import org.junit.Assert;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
    
	@Test
    public void TC01()
    {
    	
    	int winner  = App.winnerChild(1, 1);
    	Assert.assertEquals(1, winner);
    }
    
	@Test
    public void TC02()
    {
    	
    	int winner  = App.winnerChild(7, 1);
    	Assert.assertEquals(7, winner);
    }
	
	@Test
    public void TC03()
    {
    	
    	int winner  = App.winnerChild(40, 3);
    	Assert.assertEquals(28, winner);
    }
    
	@Test
    public void TC04()
    {
    	String error  = App.winnerChild(-3, 2);	
    	Assert.assertEquals("Invalid Value Provided", error);
    }
	
	@Test
    public void TC05()
    {
    	String error  = App.winnerChild(3, -2);	
    	Assert.assertEquals("Invalid Value Provided", error);
    }
}
