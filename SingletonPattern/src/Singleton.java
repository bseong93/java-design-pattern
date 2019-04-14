
public class Singleton {
	
	private static Singleton instance;
	
	public Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public void printInstaceInfo() {
		System.out.println(instance.toString());
	}

}
