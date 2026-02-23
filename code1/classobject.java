import java.util.Scanner;

class objectclass{
    public static void main(String[] args){
    
        //object creation 
        // syx (class_name  object_name = new class_name();)

        //to assign the values for the var inside the class 
        // syx (object_name  variable = values);

        Student s1 = new Student();
        s1.name="Abhinav";
        s1.id = 472;
        s1.marks = 98;

        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.marks);

    }

    // class 
    // class Syntax (class class_name { class body})

    static class Student{
        String name;
        int id;
        int marks;
    }
}