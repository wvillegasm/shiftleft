package org.shiftleft.test.selenium.mock;

import static org.mockito.Mockito.mock;

import org.junit.Test;

public class BartenderTest {

	@Test
	public void test() {
		Bartender bartender = new Bartender();
		Incrediants incrediants = mock(Incrediants.class);
		Drink drink = mock(Drink.class);
		
		bartender.mixDrink(drink, incrediants);
		
		
	}

}
