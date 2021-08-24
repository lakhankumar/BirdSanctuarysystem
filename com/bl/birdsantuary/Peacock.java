package com.bl.birdsantuary;

public class Peacock extends Bird{
	Peacock(){
		color = color.BLUR_GREEN;
		name = "peacock";
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
