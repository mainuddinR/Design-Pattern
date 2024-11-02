package Prototype1;

import java.awt.Color;
import java.lang.classfile.instruction.ReturnInstruction;

public class Cricle extends Shape {
	private float radius;
	
	public Cricle(String color,float radius) {
		super(color);
		this.radius=radius;
	}
	
	@Override
	public Shape clone() {
		return new Cricle(this);
	}
	public float getRadius() {
		return radius;
	}
	public Cricle(Cricle target) {
		super(target);
		if(target!=null) {
			this.radius=target.getRadius();
		}
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cricle)||!super.equals(obj)) 
				return false;
			Cricle cricle2=(Cricle)obj;
			return (cricle2.getRadius()==radius);
	}
}
