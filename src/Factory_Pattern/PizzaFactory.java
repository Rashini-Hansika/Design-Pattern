package Factory_Pattern;

public class PizzaFactory {
	
	public Pizza createPizza(String msg) {
		if(msg.equals("Chicken"))
			return new ChickenPizza();
		if(msg.equals("Vege"))
			return new VegePizza();
		if(msg.equals("Cheese"))
			return new CheesePizza();
		else
			return null;
	}
}
