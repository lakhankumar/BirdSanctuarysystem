package com.bl.birdsantuary;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.id = "Duck-001";
		Peacock peacock = new Peacock();
		peacock.id = "peacock-001";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "ostrich-001";
		Parrot parrot = new Parrot();
		parrot.id = "parrot-001";
		
		BirdSantuaryRepository birdSantuaryRepository = new BirdSantuaryRepository();
		
		birdSantuaryRepository.add(duck);
		birdSantuaryRepository.add(ostrich);
		birdSantuaryRepository.add(parrot);
		birdSantuaryRepository.add(peacock);
		
		birdSantuaryRepository.print();
	}
}
