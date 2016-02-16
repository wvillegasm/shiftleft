package org.shiftleft.test.selenium.mocks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class SimpleWaiterImplTest {

	SimpleWaiterImpl objectUnderTest;
	KitchenService kitchenServiceMock = mock(KitchenService.class);
	
	@Before
	public void setUp() {
		objectUnderTest = new SimpleWaiterImpl(kitchenServiceMock);
	}
	
	@Test
	public void test() throws WrongMealException {
		// given How mock should behave
		String mealName = "Hamburguer";
		boolean vegetarian = false;
		Meal referenceMeal = new FirstCourse();
		when(kitchenServiceMock.prepareMeal(mealName, vegetarian)).thenReturn(referenceMeal);
		
		// when
		Meal orderedMeal = objectUnderTest.bringOrderMeal(mealName, vegetarian);
		
		// then
		assertThat(orderedMeal, Is.is(referenceMeal));
		verify(kitchenServiceMock).prepareMeal(mealName, vegetarian);
		
	}

}
