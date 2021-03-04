package com.company;

public class Animal
{
    protected String name;
    protected String color;
    protected String MakeSound;

    public String hiAnimal()
    {
        return MakeSound + " I'm " + name + " and my color is " + color;
    }

    public Animal getAnimal()
    {
        return new Animal();
    }
    public String getName(String Name)
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String Color)
    {
        this.color = Color;
    }
}