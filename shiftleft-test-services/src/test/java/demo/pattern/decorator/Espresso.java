package demo.pattern.decorator;

public class Espresso extends Beverage {
	
	public Espresso(){
		super();
		description = "Espresso Coffee";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
