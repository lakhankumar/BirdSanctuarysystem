package com.bl.birdsantuary;

import java.util.Objects;

// view layer
abstract public class Bird {
	
	enum color{
	 RED,BLACK_WHITE, GREY, BLACK, WHITE,GREEN,BLUR_GREEN
	}
	
	String id;
	color color;
	String name;
	
	@Override
	public String toString() {
		return "Bird [id=" + id + ", color=" + color + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}
	
	abstract public void fly();
	abstract public void swim();
	abstract public void eat();
	
}