package com.bl.birdsantuary;

import java.util.Scanner;

//control layer
public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.userMenu();
		System.out.println("GOOD BYE!!");
	/*	Duck duck = new Duck();
		duck.id = "Duck-001";
		Peacock peacock = new Peacock();
		peacock.id = "peacock-001";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "ostrich-001";
		Parrot parrot = new Parrot();
		parrot.id = "parrot-001";
		Parrot parrot2 = new Parrot();
		parrot2.id = "parrot-002";
		
		BirdSantuaryRepository birdSantuaryRepository = new BirdSantuaryRepository();
		
		birdSantuaryRepository.add(duck);
		birdSantuaryRepository.add(ostrich);
		birdSantuaryRepository.add(peacock);
		birdSantuaryRepository.add(parrot);
		birdSantuaryRepository.add(parrot);
		birdSantuaryRepository.add(parrot2);
		System.out.println("after addition");
		
		birdSantuaryRepository.print();
		
		birdSantuaryRepository.remove(peacock);
		System.out.println("after deletion");
		
		birdSantuaryRepository.print();*/
	}
	
	void userMenu() {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		final int EXIT_VALUE = 10;
		while(option != EXIT_VALUE) {
			System.out.println("Enter your options");
			System.out.println("\n1. add \n2. remove \n3. print birds \n4. print swimable"
					+ "\n5. flyable \n6. eatable \n"+EXIT_VALUE+". EXIT\n");
			option = scan.nextInt();
			
			switch (option) {
				case 1:	
					Duck duck = new Duck();
					duck.id = "Duck-001";
					Peacock peacock = new Peacock();
					peacock.id = "peacock-001";
					Ostrich ostrich = new Ostrich();
					ostrich.id = "ostrich-001";
					Parrot parrot = new Parrot();
					parrot.id = "parrot-001";
					Parrot parrot2 = new Parrot();
					parrot2.id = "parrot-002";
					
					BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
					
					birdSantuaryRepository.add(duck);
					birdSantuaryRepository.add(ostrich);
					birdSantuaryRepository.add(peacock);
					birdSantuaryRepository.add(parrot);
					birdSantuaryRepository.add(parrot);
					birdSantuaryRepository.add(parrot2);
					break;
				case 2:
					System.out.println("enter the bird name which you want to remove\n");
					String birdname = scan.nextLine();
					birdname = scan.next();
					birdSantuaryRepository = BirdSantuaryRepository.getInstance();
					Bird removeBird = birdSantuaryRepository.getBird(birdname);
					birdSantuaryRepository.remove(removeBird);
					break;
				case 3:
					ViewLayer viewLayer = new ViewLayer();
					viewLayer.print();
					break;
				case 4:
					viewLayer = new ViewLayer();
					viewLayer.printSwinable();
					break;
				case 5:
					viewLayer = new ViewLayer();
					viewLayer.printFlyable();
					break;
				case 6:
					viewLayer = new ViewLayer();
					viewLayer.printEatable();
					break;
			}
		}
	}
}
