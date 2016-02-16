package demo.pattern.factory.product;

import java.util.ArrayList;

public abstract class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("STEP 1");
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding toppings:");
		for (String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}

	public void bake() {
		System.out.println("STEP 2");
		System.out.println("Bake for 25 minutes at 350 F");
	}

	public void cut() {
		System.out.println("STEP 3");
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("STEP 4");
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

}
