package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        variables and method belong to the object -- need to make an instance

        Dog myDog = new Dog("Fred", "cocker spaniel", 5);

        myDog.bark();

        System.out.println(myDog);
        System.out.println(myDog.getAge());

        myDog.setAge(7);
        System.out.println(myDog.getAge());

        Celebrity newCelebrity = new Celebrity();

        newCelebrity.setName("Tom Cruise");

        newCelebrity.setFamousFor("jumping on couch");
        newCelebrity.setAge(60);

        System.out.println(newCelebrity.name + " is " + newCelebrity.age + " years old and is famous for " + newCelebrity.famousFor);

        Celebrity newCelebrity2 = new Celebrity();
        newCelebrity2.setName("Jamie Foxx");
        newCelebrity2.setFamousFor("portraying Ray Charles");
        newCelebrity2.setAge(54);

        System.out.println(newCelebrity2.name + " is " + newCelebrity2.age + " years old and is famous for " + newCelebrity2.famousFor);

    }
}
