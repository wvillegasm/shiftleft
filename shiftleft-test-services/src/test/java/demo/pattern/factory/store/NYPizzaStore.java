package demo.pattern.factory.store;

import demo.pattern.factory.SimplePizzaFactory;
import demo.pattern.factory.product.NYStyleCheesePizza;
import demo.pattern.factory.product.NYStyleClamPizza;
import demo.pattern.factory.product.NYStylePepperoniPizza;
import demo.pattern.factory.product.NYStyleVegiePizza;
import demo.pattern.factory.product.Pizza;

public class NYPizzaStore extends PizzaStore {

	/*
	 * public NYPizzaStore(SimplePizzaFactory factory) { super(factory); }
	 */

	public NYPizzaStore() {
	}

	@Override
	protected Pizza createPizza(String type) {

		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("vegie")) {
			pizza = new NYStyleVegiePizza();
		}

		return pizza;
	}

	@Override
	protected Pizza factoryMethod() {
		// TODO Auto-generated method stub
		return null;
	}

}
