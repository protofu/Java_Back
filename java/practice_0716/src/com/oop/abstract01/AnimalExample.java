package com.oop.abstract01;

public class AnimalExample {
	public static void main(String[] args) {
		Pig pig = new Pig();
		Monkey monkey = new Monkey();
		Panda panda = new Panda();
		Rabbit rabbit = new Rabbit();
//		pig.sound();
//		monkey.sound();
//		panda.sound();
//		rabbit.sound();
		
//		Animal[] aniArr = {monkey, panda, pig, rabbit};
//		for(Animal a : aniArr) {
//			a.sound();
//		}
		
		animalSound(monkey);
		animalSound(panda);
		animalSound(rabbit);
		animalSound(pig);
		
	}
	
	public static void animalSound(Animal a) {
		a.sound();
	}
}
