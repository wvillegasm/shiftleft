package demo.pattern.decorator;

public abstract class Beverage {
	protected String description = "Unknown!!!";
	
	public abstract double cost();
	
	public String getDescription(){
		return this.description;
	}
}
