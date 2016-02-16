package demo.pattern.strategy.impl;

import demo.pattern.strategy.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with wings");
	}

}
