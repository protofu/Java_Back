package com.oop.inheritance03;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();
		
		System.out.println();
		
		Animal animalD = new Dog();
		animalD.makeSound();
		
		System.out.println();
		
		Dog dog = (Dog) animalD;
		dog.makeSound();
		dog.bite();
		
		System.out.println();
		
		Animal animalC = new Cat();
		animalC.makeSound();
		
		System.out.println();
		
		Cat cat = (Cat) animalC;
		cat.makeSound();
		cat.scatch();
	}
}
