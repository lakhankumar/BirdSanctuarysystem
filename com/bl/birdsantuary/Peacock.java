package com.bl.birdsantuary;

public class Peacock extends Bird implements Flyable {
	Peacock(){
		color = color.BLUR_GREEN;
		name = "peacock";
	}

	@Override
	public void fly() {
		System.out.println(name+ " partially fly");
	}

	@Override
	public void eat() {
		System.out.println(name+ " can eat");
	}
}
