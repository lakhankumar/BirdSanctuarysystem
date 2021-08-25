package com.bl.birdsantuary;

public class ViewLayer {
	
	
	public void print() {
		BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
		for (Object items:birdSantuaryRepository.getAllBird()) {
			System.out.println(items);
		}
	}
	
	public void printFlyable() {
		BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
		for (Bird item:birdSantuaryRepository.getAllBird()) {
			if(item instanceof Flyable) {
//				((Flyable) item).fly();   shortcut for type cast similar to below 2 steps
				Flyable flyable = (Flyable) item;
				flyable.fly();
			}
		}
	}
	
	public void printSwimmable() {
		BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
		for (Bird item:birdSantuaryRepository.getAllBird()) {	
			if(item instanceof Swimmable) {
				((Swimmable) item).swim();
			}
			
		}
	}
	
	public void printEatable() {
		BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
		for (Bird item:birdSantuaryRepository.getAllBird()) {
			item.eat();
		}
	}
	
}
