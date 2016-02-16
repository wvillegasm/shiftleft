package demo.pattern.decorator;

import java.lang.reflect.InvocationTargetException;

public class BeverageFactory {
	public static Beverage getBeverage(Class<? extends Beverage> type, Beverage b)
			throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Beverage temp = null;
		
		if(CondimentDecorator.class.isAssignableFrom(type)){
			Class<Beverage>[] cArg = new Class[1];
			cArg[0] = Beverage.class;
			temp = (CondimentDecorator)type.getDeclaredConstructor(cArg).newInstance(b);
		}else if(Beverage.class.isAssignableFrom(type)){
			temp = type.newInstance();
		}
		
		return temp;
	}
}
