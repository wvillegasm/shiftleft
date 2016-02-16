package demo.pattern.factory.product;


public class CheesePizza extends Pizza {

	@Override
	public void bake() {
		super.bake();
		System.out.println("********* Baking as I Want *********");
	}

	

}
