package demo.pattern.strategy.impl;

import demo.pattern.strategy.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm cannot fly!");
	}

}
