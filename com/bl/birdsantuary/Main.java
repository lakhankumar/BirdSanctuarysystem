package com.bl.birdsantuary;

import java.util.EnumSet;
import java.util.Scanner;

import com.bl.birdsantuary.Bird.color;

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
			System.out.println("1. add \n2. remove \n3. print birds \n4. print swimable"
					+ "\n5. print flyable \n6. print eatable \n7. edit bird \n"+EXIT_VALUE+". EXIT");
			option = scan.nextInt();
			ViewLayer viewLayer = new ViewLayer();
			
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
					System.out.println("enter the bird name which you want to remove");
					String birdname = scan.nextLine();
					birdname = scan.next();
					birdSantuaryRepository = BirdSantuaryRepository.getInstance();
					Bird removeBird = birdSantuaryRepository.getBird(birdname);
					birdSantuaryRepository.remove(removeBird);
					break;
				case 3:
					viewLayer.print();
					break;
				case 4:
					viewLayer.printSwimmable();
					break;
				case 5:
					viewLayer.printFlyable();
					break;
				case 6:
					viewLayer.printEatable();
					break;
				case 7:
					editBird();
					break;
			}
		}
	}

	private void editBird() {
		System.out.println("Enter the bird name which you want to edit");
		Scanner scan = new Scanner(System.in);
		String editName = scan.next();
		
		Bird editBird = BirdSantuaryRepository.getInstance().getBird(editName);
		
		int choice = 0;
		while(choice != 4) {
			System.out.println("Enter your editing choice");
			System.out.println("1. Edit bird name \n2. Edit id \n3. Edit color \n4. exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter new name");
				String newName = scan.next();
				editBird.name = newName;
				break;
			case 2:
				System.out.println("Enter new ID");
				String newId = scan.next();
				editBird.id = newId ;
				break;
			case 3:
				System.out.println("Enter new color");
				int count = 0;
				for (Bird.color color: EnumSet.allOf(Bird.color.class)) {
					System.out.println(count + "." + color);
					count++;
				}
				int colorchoice = scan.nextInt();
				int count1 = 0;
				for (Bird.color color: EnumSet.allOf(Bird.color.class)) {
					if(colorchoice == count1) {
						editBird.color = color;
						break;
					}
					count1++;
				}
				break;
			
			}
		}
	}
}
