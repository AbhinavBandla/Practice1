// ************   static keyword  ************
/*  
       static means the variable belongs to the class, not to objects,
        and all objects share the same single copy.

        non-static → belongs to each object ✅

        static → belongs to class, shared by all objects ✅

        Syntax Static data_type VAr_name = "Value";

        static variable should call with class name like this
        
        class_name variable_name = new_value;
 
 
 */
class Apartment{
    String flatname;
    int flatnum;
    static String appName = "Tranquuil Towers";

    Apartment(){

    }

    Apartment(String flatname, int flatnum){
        this.flatname = flatname;
        this.flatnum = flatnum;
    }

   
    
}
class stabase{
    public static void main(String[] args){
        Apartment a1 = new Apartment();
        a1.flatname = "R.Rahul";
        a1.flatnum = 503;

        Apartment a2 = new Apartment("Abhinav",504);

        //if you want to chnge the static var date just do this class_name.var_name = value;
       // Apartment.appName = "sky Towers";  // but here we have consider on thing that if you modify once it will change in over all data 

        System.out.println(a1.flatname + " " + a1.flatnum + " "+Apartment.appName);
        System.out.println(a2.flatname + " " + a2.flatnum + " "+Apartment.appName);
    }
}

// practice 1 
/*   

class Main {
    public static void main(String[] args) {
        Student s1 =  new Student("Abhinav",472);
        Student s2 =  new Student("AAnad",473);
        s1.display();
        s2.display();
    }
}
class Student{
    String name ;
    int rollNo ;
    static String collegeName = "Narayana Engineering  ";
    
    Student (String name , int roll){
        this.name = name ;
        this.rollNo = roll;
    }
    
    void display(){
        System.out.println(name + " " + rollNo + " "+collegeName);
    }
}  
 */


//   ************** Example 2 ****************


/*
    

class Main {
    public static void main(String[] args) {
        Employee e1 =  new Employee("Abhinav",472);
        Employee e2 =  new Employee("AAnad",473);
        Employee.companyName = "TCS";
        
        System.out.println(e1.getDetails());
        System.out.println(e2.getDetails());
    }
}

class Employee{
    String name ;
    int empId ;
    static String companyName = " Infosis  ";
    
    Employee (String name , int Id){
        this.name = name ;
        this.empId = Id;
    }
    
    String getDetails(){
       return name + " " + empId + " " + companyName;
    }
}
*/


//   ************* example 3 ************


/* 
class Main {
    public static void main(String[] args) {
        Car c1 =  new Car("RED",3000000);
        System.out.println(c1.display());
        Car c2 =  new Car("Black &Red",560000);
        //here actually by the order Static value chamges to  "HONDA"
        Car.brand = "Honda";
        System.out.println(c2.display());
        System.out.println(c1.display());
    }
}

class Car{
    String colour ;
    int price ;
    static String brand = " TOYOTA  ";
    
    Car(String colour , int price){
        this.colour = colour ;
        this.price = price;
    }
    
    String display(){
       return colour + " " + price + " " + brand;
    }
}
    */