// **********  Array of objects **********
            /*   
                    An Array That stores the multiple objects of a class 

                    Syntax of object array **classname[] arr-name = new classname[size]
                    size -  it is your wish 

                    then to create an object 
                    syntax - arr_name[index] = new class_name();

                    to add elemnts arr_name[index].variable = value;

             */
class Main{
    public static void main(String[] args ){
        // *** Assigning values directly 
    //  class_name[] arr_var = new Class_name[size];
        Student[] stu = new Student[2];

        //arr-var[index] = new class_name();
        stu[0] = new Student();

        stu[0].name="Abhinav";
        stu[0].id = 472;
        stu[0].section = "Lilly";

       
       System.out.println(stu[0].name+ " "+ stu[0].id + " "+ stu[0].section);
    }
}
class Student{
    String name ;
    int id;
    String section;

}