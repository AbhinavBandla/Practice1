import java.util.Scanner;
class Main{
    public static void main(String[] args ){
        Human h =  new Human();
        Human h1 = new Human("Abhi");
        Human h2 = new Human("Surya",23,785.978756);

        h.properties();
        h1.properties();
        h2.properties();
    }
}
class Human{
    String name;
    int age ;
    double height ;
    double weight;

    // 1
    Human(){
        System.out.println("Default constructor");
    }

    Human(String name){
        this.name = name;
    }

    Human(String name , int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //method 
    void properties (){
        System.out.printf(name + " " + age +" "+"%.2f ",height);
        System.out.println();
    }
}