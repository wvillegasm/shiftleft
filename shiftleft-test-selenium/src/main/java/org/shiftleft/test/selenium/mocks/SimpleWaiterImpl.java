package org.shiftleft.test.selenium.mocks;

public class SimpleWaiterImpl implements Waiter{

	private final KitchenService kitchenService;

	public SimpleWaiterImpl(KitchenService kitchenService) {
		super();
		this.kitchenService = kitchenService;
	}
	
	@Override
	public Meal bringOrderMeal(String mealName, boolean vegetarian) throws WrongMealException{
		Meal prepareMeal = getKitchenService().prepareMeal(mealName, vegetarian);
		if(prepareMeal.isVegatarian() != vegetarian){
			throw new WrongMealException("You've prepare a wrong meal");
		}
		return prepareMeal;
	}

	public KitchenService getKitchenService() {
		return kitchenService;
	}
	
	
	
}
