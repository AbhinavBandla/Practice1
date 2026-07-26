class Student {
    private String name = "Rahul";
    private int age = 20;

    void display(){
        System.out.println(name);
    }
    void showAge(){
        System.out.println(age);
    }
}
class privateVarDemo{
    public static void main(String[] args){
        // case 1 print name 
        Student s1 = new Student();
        s1.display();
        // case-2 trying to access the private variable 
        Student s2 = new Student();
        // System.out.println(s2.age);
        s2.showAge();
    }
}