package com.bl.birdsantuary;

public class Ostrich extends Bird {
	Ostrich(){
		color = color.GREY;
		name = "ostrich";
	}

	@Override
	public void fly() {
		
	}

	@Override
	public void swim() {
		
	}

	@Override
	public void eat() {
		System.out.println(name+ " can eat");
	}

}
