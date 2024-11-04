package PrototypeL04_Q1;


public abstract class Product{
	private String name;
	private String category;
	private int price;
	
	public Product(String name, String category, int price) {
		this.name=name;
		this.category=category;
		this.price= price;
	}
	
	public Product(Product target) {
		if(target!=null) {
			this.name=target.getName();
			this.category=target.getCategory();
			this.price=target.getPrice();
		}
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract Product clone();
	
}
