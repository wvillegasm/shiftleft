package demo.pattern.factory.store;

import demo.pattern.factory.SimplePizzaFactory;
import demo.pattern.factory.product.Pizza;

public abstract class PizzaStore {
	//SimplePizzaFactory factory;

	/*public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}*/

	// (final) Ensure and force all subclasses make uses of orderPizza without modified it. 
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type); // factory.createPizza(type); <<--- It's only an idiom, not a really Design Pattern.
		//Pizza pizza = factory.createPizza(type); // <<--- It's only an idiom, not a really Design Pattern.

		// All Pizza making activities to the PizzaStore:
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		// ---------------------------------------------

		return pizza;
	}

	// Giving the freedom to franchise to have their own regional style.
	protected abstract Pizza createPizza(String type); // <<-- Factory Method, must be abstract.
	
	// Factory
	protected abstract Pizza factoryMethod();

}
