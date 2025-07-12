package turing.lesson09;

public class Human extends Animal{
    private Dog dog;
    private Cat cat;

    public Human(Dog dog, Cat cat){
        this.dog = dog;
        this.cat = cat;
    }

    public Human(){

    }

    public Dog getDog(){
        return dog;
    }

    public void setDog(Dog dog){
        this.dog = dog;

    }

    public Cat getCat(){
        return cat;
    }

    public void setCat(Cat cat){
        this.cat = cat;
    }

    @Override
    public String toString(){
        return "%s | { Dog: %s } | { Cat: %s }".formatted(
                super.toString(),
                dog != null ? dog.toString() : "No Dog",
                cat != null ? cat.toString() : "No Cat"
        );
    }
}
