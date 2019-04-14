
public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.setCar(new CarA());
		driver.move();
		
		driver.setCar(new CarB());
		driver.move();
	}

}
