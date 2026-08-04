/*
POJO - Plain Old Java Object  1
    instead of holding a block of executable code (like complex logic or calculations), 
    a POJO is designed specifically to hold data (variables) in one place.

    Don't change your class only because a framework forces you to.
*/
/*
 Java Bean :  
 A JavaBean is a special type of POJO that follows some predefined rules.
 Every JavaBean is a POJO,But every POJO is NOT a JavaBean.

 A JavaBean must follow 4 rules.
Rule 1
All instance variables must be private.
Rule 2
Provide public getters and setters.
Rule 3
Must have a public no-argument constructor.
Why?
Because many frameworks create objects like this:So the framework needs a no-argument constructor.
Rule 4
Should implement Serializable.

interView Style - 
A JavaBean is a POJO with private fields, 
 public getters and setters, and a public no-argument constructor.

*/
import java.util.Scanner;
class Student{
    private String name;
    private int age ;

    public Student(){

    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(){

    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSalary(double salary){
        if(salary > 0.0){
        this.salary = salary;
        }else{
            System.out.println("In-valid Salary");
        }
    }
    double getSalary(){
        return salary;
    }
}
class GetterAndSetterExam{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        s1.setName("Abhinav");
        s1.setAge(21);

        System.out.println("Name = "+s1.getName()+" \n" + "Age = "+s1.getAge());
        System.out.println();

        Employee e1 = new Employee();
        e1.setName("Rahul");
        e1.setSalary(50000);

        System.out.println("Name = "+e1.getName()+" \n" + "Salary = "+e1.getSalary());
        System.out.println();

        e1.setSalary(-10000);
        System.out.println("Name = "+e1.getName()+" \n" + "Salary = "+e1.getSalary());
        System.out.println();

        // BankAccount
        BankAccount b1 = new BankAccount();
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        //scanner.nextLine();

        System.out.print("Set AtmPin : ");
        int pin = scanner.nextInt();

        System.out.print("Enter Deposit amount :");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter WithDrawAmount : ");
        double withDrawAmount = scanner.nextDouble();


        b1.setAccountHolder(name);
        b1.deposit(depositAmount);
        b1.withDraw(withDrawAmount);
        b1.setAtmpin(pin);

        System.out.println("Holder : "+b1.getAccountHolder() + " \n "+ "Balance : "+b1.getBalance());
        scanner.close();
    }
}
class BankAccount{
    private String accountHolder;
    private double balance;
    private int atmPin;

    void setAccountHolder(String name){
        this.accountHolder = name;
    }
    String getAccountHolder(){
        return accountHolder;
    }

    //balance
    void deposit(double amount){
        if(amount > 0){
            balance =+ amount;
        }else{
            System.out.println("Positive number Only");
        }
    }
    void withDraw(double amount){
        if(amount > 0 && balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("InSufficiant Balance");
        }
    }
    double getBalance(){
        return balance;
    }

    //atmPin
    void setAtmpin(int atmPin){
        if(atmPin >= 1000 && atmPin <= 9999){
            this.atmPin = atmPin;
        }else{
            System.out.println("Invalid Pin");
        }
    }
}