package StrategyPattern;

public class MollardDuck extends Duck {

	public MollardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I am Model Duck");
	}
}
