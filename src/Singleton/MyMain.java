package Singleton;

public class MyMain {
	public static void main(String[] args) {
		//Singleton ob = new Singleton();
		Singleton ob = Singleton.getInstance();
		//
		//
		
		Singleton ob2 = Singleton.getInstance(); //both pointing to same object
		
	}
}
