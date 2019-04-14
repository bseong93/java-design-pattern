
public abstract class Recipe {
	protected abstract void addSugar();
	protected abstract void addSalt();
	
	final void makeDrink() {
		addWater();
		addSugar();
		addSalt();
		pourIntoCup();
		
		System.out.println();
	}
	
	private void addWater() {
		System.out.println("add water");
	}
	
	private void pourIntoCup() {
		System.out.println("pour drink into a cup");
	}
}
