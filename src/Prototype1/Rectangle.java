package Prototype1;

public class Rectangle extends Shape {
	public int width;
	public int height;
	//public String color;
	public Rectangle(int width, int height, String color) {
		super(color);
		this.width=width;
		this.height=height;
	}
	
	public Rectangle(Rectangle target) {
		super(target);
		if(target!=null) {
			this.height=target.getWidth();
			this.width=target.getWidth();
			
		}
		
	}
	
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Rectangle)||!super.equals(obj)) {
			return false;	
		}
		Rectangle rectangle2=(Rectangle)obj;
		
		return ((rectangle2.getWidth()==this.width&& rectangle2.getHeight()==this.height));
		
	}
}
