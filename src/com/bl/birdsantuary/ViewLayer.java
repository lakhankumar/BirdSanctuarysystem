package com.bl.birdsantuary;

public class ViewLayer {


    public void print() {
        BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
        for (Object items : birdSantuaryRepository.getAllBird()) {
            System.out.println(items);
        }
    }

    public void printFlyable() {
        BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
        for (Bird item : birdSantuaryRepository.getAllBird()) {
            if (item.canFly) {
                item.fly();
            }
        }
    }

    public void printSwimmable() {
        BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
        for (Bird item : birdSantuaryRepository.getAllBird()) {
            if (item.canSwim) {
                item.swim();
            }
        }
    }

    public void printEatable() {
        BirdSantuaryRepository birdSantuaryRepository = BirdSantuaryRepository.getInstance();
        for (Bird item : birdSantuaryRepository.getAllBird()) {
            item.eat();
        }
    }

    public void printBirdCount() {
        System.out.println("Total bird :" + BirdSantuaryRepository.getInstance().getTotalBird());
    }

    public void printSwimableCount() {
        System.out.println("no.of birds that can swim: " + BirdSantuaryRepository.getInstance().swimmableBirds());
    }

    public void printFlyableCount() {
        System.out.println("no.of birds that can fly: " + BirdSantuaryRepository.getInstance().flyableBirds());
    }

}
