package StrategyPattern;

public abstract class Duck {
	IFlyBehaviour flyBehaviour;
	IQuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float even");
	}
	
	public void setFlyBehaviour (IFlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.quackBehaviour=quackBehaviour;
	}
}
