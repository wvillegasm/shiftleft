package demo.pattern.decorator;

import java.lang.reflect.InvocationTargetException;

public class TestClazz {

	/**
	 * @param args
	 * @throws InstantiationException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Beverage b = BeverageFactory.getBeverage(DarkRoast.class, null);
		System.out.println(b.getDescription() + " " + b.cost());
		
		b = BeverageFactory.getBeverage(Soy.class, b);
		b = BeverageFactory.getBeverage(SteamedMilk.class, b);
		b = BeverageFactory.getBeverage(Mocha.class, b);
		b = BeverageFactory.getBeverage(Mocha.class, b);
		
		System.out.println(b.getDescription() + " " + b.cost());

	}

}
