package com.company;

public class Dog {
//    variables (state)
//    can set default values here when declaring the variable
    String name;
    String breed;
//   final in front of String will not allow to reassign String
    private int age;
//    private restricts access

//    constructor - method with same name as the class (e.g. Dog)
//    allows us to pass in custom data to each instance created


    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

//    getters and setters
//    getters - show value of private variables
//    setters - update value of private variables


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
          this.age = age;

        }
    }

    //    methods (behavior)
    void bark(){
        System.out.println("WOOF");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
