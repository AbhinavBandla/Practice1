
// ***************  using constructors   *******************

class Main{ 
    public static void main(String[] args ){
        // *** Assigning values directly 

    //  class_name[] arr_var = new Class_name[size];
        Student[] stu = new Student[2];

        //arr-var[index] = new class_name();
        // here we have constructor we assign the values directly inside it
        stu[0] = new Student("Vyshnavi",2866,"Lotus");
        stu[1] = new Student("Abhi",472,"Lilly");
        
        stu[1].myConstructor();
        stu[0].myConstructor();

    }// this only with constructor 
}
class Student{
    String name ;
    int id;
    String section;
    
    Student(String name, int id,String section){
        this.name = name;
        this.id = id;
        this.section = section;
    }
    void myConstructor(){
        System.out.println(name + " " + id + " " + section);
    }
}