package demo.pattern.strategy.impl;

import demo.pattern.strategy.IQuackBehavior;

public class Quack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Qack");
	}

}
