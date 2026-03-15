//      ****************   INHERITANCE iNTRO    *************
/*     Inheritance means one class gets the variables and methods of another class.
        Syntax   
        class Class_name1{
        }
        class class_name extends class_name1{
        }

        *****Tip class_names Should start with capital letter like person -> Person

        Rule 1:

    Child class inherits variables and methods

    Rule 2:

    Child class does not inherit constructors, and cannot directly access private members

*/
import java.util.Scanner;
class Person{
    String name ;

    Person(){
        System.out.println("I am Constructor form perent_class");
    }

    Person(String name){
        this.name = name;
    }

    String displayName(){
        return name;
        
    }
}
class student extends Person{
    int marks ;
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        student s1 = new student();
        s1.name = "Ramesh";
        s1.marks = 87;
        System.out.print("Enter Father name : ");
        String name = sc.nextLine();
        super(name);
        
        student s2 = new student();
        s2.name = "Abhinav";
        s2.marks = 97;
        super(name);

        System.out.println(s1.displayName()+ " " + s1.marks);
        System.out.println(s2.displayName()+ " " + s2.marks);
}
}