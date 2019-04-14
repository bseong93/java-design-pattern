
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle rectangle1 = new Rectangle(100);
		Rectangle rectangle2 = (Rectangle) rectangle1.clone();
		
		rectangle2.setWidth(200);
		
		rectangle1.printWidth();
		rectangle2.printWidth();
		
	}

}
