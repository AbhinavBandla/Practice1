// class type-1
class Student{ 
    String name ="Abhinav";
    int age =23 ;
    double gpa= 80.1234;

}

//class type-2
class Creating{
    String name;
    int age;
    double weight;
}
class classobj{
    public static void main(String[] args){
        Student s1 = new Student();
        Creating Human = new Creating();


      //  System.out.println(s1); // error cause class is an reference data -type .
            //class type -1 
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gpa);

        //class type-2
        Human.name="Abhi";
        Human.age=26;
        Human.weight = 40;

        System.out.println(Human.name);
        System.out.println(Human.age);
        System.out.println(Human.weight);



    }
}