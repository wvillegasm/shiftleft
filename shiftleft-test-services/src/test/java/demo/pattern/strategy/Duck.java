package demo.pattern.strategy;

public abstract class Duck {
	protected IFlyBehavior flyBehavior;
	protected IQuackBehavior qackBehavior;

	public Duck() {
		super();
	}

	public abstract void display();

	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public IQuackBehavior getQackBehavior() {
		return qackBehavior;
	}

	public void setQackBehavior(IQuackBehavior qackBehavior) {
		this.qackBehavior = qackBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQack() {
		qackBehavior.quack();
	}

	public void swing() {
		System.out.println("All ducks flat, even decoys!");
	}
}
