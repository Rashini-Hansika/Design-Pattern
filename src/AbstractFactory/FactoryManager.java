package AbstractFactory;

public class FactoryManager {
	public AbstractFactory createPizza(String msg) {
		if(msg.equals("Chicken"))
			return new ChickenFactory();
		if(msg.equals("Dought"))
			return new DoughtFactory();
		else
			return null;
	}
}
