
public class Main {
	
	public static void main(String args[]) {
		Singleton singleton1 = new Singleton();
		Singleton singleton2 = new Singleton();
		
		singleton1.getInstance().printInstaceInfo();
		singleton2.getInstance().printInstaceInfo();
	}

}
