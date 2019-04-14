
public class Rectangle implements Cloneable {	

	int width;
	
	public Rectangle(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void printWidth() {
		System.out.println("width = " + width);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangle rectangle = (Rectangle) super.clone();
		
		return rectangle;
	}

}
