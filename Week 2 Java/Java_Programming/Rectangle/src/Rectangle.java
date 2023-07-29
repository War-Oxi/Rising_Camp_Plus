public class Rectangle {
	private int width;


	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width){
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}

	public int area(){
		return height * width;
	}

	public int perimeter() {
		return 2 * (height + width);
	}

	public String toString(){
		return String.format("width = %d, height = %d, area = %d, perimeter = %d",
			width, height, area(), perimeter());
	}
}
