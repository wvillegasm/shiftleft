package org.shiftleft.test.selenium.mocks;

public interface Waiter {

	Meal bringOrderMeal(String mealName, boolean vegerarian) throws WrongMealException;

}
