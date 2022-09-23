package StrategyPattern;

public class FlyRocketPower implements IFlyBehaviour{
	
	@Override
	public void fly() {
		System.out.println("I am flying with rocket power");
	}
}
