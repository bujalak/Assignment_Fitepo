package Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fitepo_Scripts extends Testbase {
	
	@Test
	public void Validate_the_setup() throws InterruptedException {
		fitepo.get_revenue().click();
		Thread.sleep(3000);
		fitepo.window_scroll();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		fitepo.clear_Text();
		fitepo.get_text_field().sendKeys("820");
		
	
		fitepo.window_scroll();
		fitepo.checkbox_selection();
		Thread.sleep(3000);
		String text = fitepo.get_total_price();
		System.out.println(text);
		boolean isvalid = text.equals("$110700");
		Assert.assertTrue(isvalid);
		
	}

}
