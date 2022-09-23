package AbstractFactory;

public class Client {
	FactoryManager ob = new FactoryManager();
	
	AbstractFactory chicken = ob.createPizza("Chicken");
	Chicken chick = chicken.createChicken("Thanduri");

	AbstractFactory dought = ob.createPizza("Dought");
	Dought mydought = dought.createDought("Double");
	
}
