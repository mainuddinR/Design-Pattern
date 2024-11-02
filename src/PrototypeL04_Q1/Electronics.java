package BSSE1472_L04_Q1;

import java.sql.Date;

import Prototype1.Rectangle;

public class Electronics extends Product {
	private int capacities;
	private String date;
	
	public Electronics(String name, String category, int price, int capacities, String date) {
		super(name, category, price);
		this.capacities=capacities;
		this.date=date;
	}
	public Electronics(Electronics target) {
		super(target);
		if(target!=null) {
			this.capacities=target.getCapacities();
			this.date=target.getDate();
			
		}	
	}
	public int getCapacities() {
		return capacities;
	}
	public String getDate() {
		return date;
	}
	@Override
	 public Product clone() {
			return new Electronics(this);
	}
}
