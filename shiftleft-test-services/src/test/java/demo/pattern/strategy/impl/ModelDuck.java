package demo.pattern.strategy.impl;

import demo.pattern.strategy.Duck;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		qackBehavior = new MuteQack();
	}
	
	@Override
	public void display() {
		System.out.println("Model rock!");
	}

}
