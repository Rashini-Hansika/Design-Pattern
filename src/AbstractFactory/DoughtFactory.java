package AbstractFactory;

public class DoughtFactory extends AbstractFactory{
	
	public Dought createDought(String msg) {
		if(msg.equals("Thin"))
			return new ThinDought();
		if(msg.equals("Thick"))
			return new ThickDought();
		if(msg.equals("Double"))
			return new DoubleDought();
		else
			return null;
	}
	
	public Chicken createChicken(String msg) {
		return null;
	}

	
}
