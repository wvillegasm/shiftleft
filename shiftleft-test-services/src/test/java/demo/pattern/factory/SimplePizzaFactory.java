package demo.pattern.factory;

import demo.pattern.factory.product.CheesePizza;
import demo.pattern.factory.product.PepperoniPizza;
import demo.pattern.factory.product.Pizza;
import demo.pattern.factory.product.VeggiePizza;
/**
 * Creating a Simple Factory
 * 
 * @author 20957223521
 * This is the part that varies. Now the previous class is Client of this Factory.
 * If anyone needs a Pizza then it has to require to this Factory.
 * 
 * This Factory has only one mission: Create Pizzas for its Clients.
 * But the question here is, What implementation might we be able to swap in and out?
 * What about if we want to create NY Style or Chicago Style?
 * 
 * -- This class is not actually a REAL Design Pattern, it's more of programming idiom. --
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new VeggiePizza();
		} else if (type.equals("veggie")) {

		}

		return pizza;
	}
}
