package turing.lesson09;

public class Woman extends Human{
    public Woman(String name, int age, Dog dog, Cat cat){
        super(dog, cat);
        setName(name);
        setAge(age);
    }

    public Woman(String name, int age){
        setName(name);
        setAge(age);
    }
}
