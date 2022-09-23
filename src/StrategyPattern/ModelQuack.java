package StrategyPattern;

public class ModelQuack implements IQuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Quack Model Duck");
	}
	
}
