package StrategyPattern;

public class FlyWithWings implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I am flying with wings");
	}
	
}
