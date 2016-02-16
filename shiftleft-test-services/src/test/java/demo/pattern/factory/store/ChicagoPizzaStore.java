package demo.pattern.factory.store;

import demo.pattern.factory.SimplePizzaFactory;
import demo.pattern.factory.product.ChicagoStyleCheesePizza;
import demo.pattern.factory.product.ChicagoStyleClamPizza;
import demo.pattern.factory.product.ChicagoStylePepperoniPizza;
import demo.pattern.factory.product.ChicagoStyleVegiePizza;
import demo.pattern.factory.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	/*
	 * public ChicagoPizzaStore(SimplePizzaFactory factory) { super(factory); }
	 */
	public ChicagoPizzaStore() {

	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("vegie")) {
			pizza = new ChicagoStyleVegiePizza();
		}

		return pizza;
	}

	@Override
	protected Pizza factoryMethod() {
		return null;
	}

}
