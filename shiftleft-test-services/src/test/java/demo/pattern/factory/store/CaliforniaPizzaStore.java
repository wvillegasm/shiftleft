package demo.pattern.factory.store;

import demo.pattern.factory.SimplePizzaFactory;
import demo.pattern.factory.product.CaliforniaStyleCheesePizza;
import demo.pattern.factory.product.CaliforniaStyleClamPizza;
import demo.pattern.factory.product.CaliforniaStylePepperoniPizza;
import demo.pattern.factory.product.CaliforniaStyleVeggiePizza;
import demo.pattern.factory.product.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

	/*
	 * public CaliforniaPizzaStore(SimplePizzaFactory factory) { super(factory);
	 * }
	 */

	public CaliforniaPizzaStore() {
		
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new CaliforniaStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new CaliforniaStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new CaliforniaStyleVeggiePizza();
		}

		return pizza;
	}

	@Override
	protected Pizza factoryMethod() {
		// TODO Auto-generated method stub
		return null;
	}

}
