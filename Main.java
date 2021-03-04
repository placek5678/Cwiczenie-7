package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setMakeSound();
        dog.setName("Tola");
        dog.setColor("white");
        System.out.println(dog.hiAnimal());

        Cat cat = new Cat();
        cat.setMakeSound();
        cat.setName("Puszek");
        cat.setColor("creamy");
        System.out.println(cat.hiAnimal());
    }
}
