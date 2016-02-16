package demo.pattern.strategy.impl;

import demo.pattern.strategy.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		qackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm real Mallard Duck");
	}

}
