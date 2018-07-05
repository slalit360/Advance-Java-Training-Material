import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestJdbc 
{
	LoginDAO a;
	
	@Before
	public void setup() 
	{
		a=new LoginDAO();
	}
	
	@Test
	public void testAuthenticate() {
		boolean result=a.authenticate("system", "admin");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testTrue() 
	{
		Assert.assertTrue(a.authenticate("system", "admin"));
	}
	
	@Test
	public void testFalse() 
	{
		Assert.assertFalse(a.authenticate("admin", "admin"));
	}
}
