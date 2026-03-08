import java.util.Scanner;
class Main{
    public static void main(String[] args){

      /* without constructor 
      
        Student s1 = new Student();
        s1.name = "Abhi";
        s1.age =24;
        s1.id = 472;
        s1.percentage = 87.99657;

        s1.mystudent();

        */

        //to call the constructor 
        // pass the values for the parameter  here while creating the new block statement like below in order 

         Student s2 = new Student("Bhumi",23,472,89.945657);
         Student s3 = new Student("Surya",24,556,99.66567567);
         s2.mystudent();
         s3.mystudent();

         college c1 = new college("naraya","Muthukur Road",524346);

         c1.myCollege();

    }
}
 class Student{
        String name;
        int age ;
        int id;
        double percentage;

        // constructor = A constructor is a special method used to create and initialize an object. 
        // Syntax - className(parameter){.....}
        

        Student(String name,int age , int id ,double percentage){
            this.name = name;
            this.age = age;
            this.id= id;
            this.percentage = percentage;
        }


         void mystudent(){
            System.out.printf("He is Mr/Mrs %s , %d old ."+ 
            "he is Recongnised with the student id %d , he obtain %.2f",
                name,age,id,percentage
            );
            System.out.println();
        }
    }
    class college{
        String collegeName ;
        String Address ;
        int pincode;
        // we can use the different var inside the constructor if you want to avoid (this) keyword
        college(String name ,String add,int pin){
            collegeName = name;
             Address = add;
             pincode = pin;
        }

        void myCollege(){
            System.out.println( // here we have to use the instance variable of class not the constructor's
                collegeName + " ," + Address + " ,"+ pincode 
            );
        }
    }