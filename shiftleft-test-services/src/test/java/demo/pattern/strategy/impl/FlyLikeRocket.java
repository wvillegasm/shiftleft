package demo.pattern.strategy.impl;

import demo.pattern.strategy.IFlyBehavior;

public class FlyLikeRocket implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying like a rock");
	}

}
