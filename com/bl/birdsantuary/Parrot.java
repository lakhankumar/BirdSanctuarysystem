package com.bl.birdsantuary;

public class Parrot extends Bird implements Flyable {
	Parrot(){
		color = color.GREEN;
		name = "parrot";
	}

	@Override
	public void fly() {
		System.out.println(name+ " can fly");
	}

	@Override
	public void eat() {
		System.out.println(name+ " can eat");
	}
}
