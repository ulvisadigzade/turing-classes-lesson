package turing.lesson09;

public class FamilyApp {
    public static void main(String[] args) {
        Woman alice = new Woman("Alice",21);
        Man jon = new Man("Jon",24);

        Dog max = new Dog("Max",2);
        Cat luna = new Cat("Luna",3);

        alice.setCat(luna);
        jon.setDog(max);

        System.out.println(alice);
        System.out.println(jon);
    }
}
