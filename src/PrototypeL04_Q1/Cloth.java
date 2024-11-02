package BSSE1472_L04_Q1;
public class Cloth extends Product {
	 public String color;
	 public int size;
	 
	 public Cloth(String name, String category, int price, String color,int size) {
		 super(name, category, price);
		 this.color=color;
		 this.size=size;
	 }
	 public Cloth(Cloth target) {
			super(target);
			if(target!=null) {
				this.color=target.getColor();
				this.size=target.getSize();
				
			}
			
		}
	 public String getColor() {
		return color;
	}
	 public int getSize() {
		return size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSize(int size) {
		this.size = size;
	}
	 @Override
	 public Product clone() {
			return new Cloth(this);
		}
	 
}
