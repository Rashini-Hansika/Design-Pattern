package AbstractFactory;

public class ChickenFactory extends AbstractFactory {
	public Chicken createChicken(String msg) {
		if(msg.equals("Thanduri"))
			return new ThanduriChicken();
		if(msg.equals("Develled"))
			return new DevelledChicken();
		if(msg.equals("Masala"))
			return new MasalaChicken();
		else
			return null;
	}

	@Override
	public Dought createDought(String msg) {
		return null;
	}
}
