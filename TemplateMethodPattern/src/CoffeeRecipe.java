
public class CoffeeRecipe extends Recipe {

	@Override
	protected void addSugar() {
		System.out.println("add 20mg of sugar");
	}

	@Override
	protected void addSalt() {
		System.out.println("add 30mg of salt");
	}

}
