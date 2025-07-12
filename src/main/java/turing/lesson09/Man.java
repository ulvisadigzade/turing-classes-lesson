package turing.lesson09;

public class Man extends Human{
    public Man(String name, int age, Dog dog, Cat cat){
        super(dog, cat);
        setName(name);
        setAge(age);
    }

    public Man(String name, int age){
        setName(name);
        setAge(age);
    }
}
