
public class TeaRecipe extends Recipe {

	@Override
	protected void addSugar() {
		System.out.println("add 10mg of sugar");
	}

	@Override
	protected void addSalt() {
		System.out.println("add 10mg of salt");
	}

}
