package Amazontest;

import org.testng.annotations.Test;

public class AmazonPageTest extends BaseClass
{
  @Test(priority=1)
  public void testoption()
  {
	 ap.testoption(); 
  }
  @Test(priority=2)
  public void testaddcart()
  {
	  ap.addcart();
  }
  
}
