/* 
Getter = Read only (returns a value).

Setter = Modify only (takes a parameter, returns void).

Together, they give you full, controlled access to private variables from outside classes!
 */
class Employee{
    private String name;
    private double salary;

    void setName(String name){
        this.name = name;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
}
// *** 2 

class BankAccount{
    private String accountHolder;
    private double balance;

    void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    void setBalance(double Balance){
        if(Balance == 0 && Balance > 0){
            this.balance = Balance;
        }else{
            System.out.println("Invalid Balance");
        }
    }
    void setAccDetails(String Holder , double balance){
        this.accountHolder = Holder;
            if(balance >= 0 ){
            this.balance = balance;
        }else{
            System.out.println("Invalid Balance");
        }
    }

    String getHolderName(){
        return accountHolder;
    }
    double getBalance(){
        return balance;
    }

}
// ####3 
class Student{
    private String name;
    private int marks;
    private char grade;

    void setName(String name){
        this.name = name;
    }
    void setMarks(int marks){
        if(marks >= 0 && marks <=100){
            this.marks = marks;
             if (marks>=90 && marks<=100){
            grade = 'A';
            }else if(marks>=75){
                grade = 'B';
            }else if(marks >= 60){
                grade = 'C';
            }else if(marks >= 40){
                grade = 'D';
            }else if(marks >= 0){
                grade = 'F';
            }
        }else{
            System.out.println("Invalid marks"); 
        }
    }

    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
    char getGrade(){
        return grade;
    }
}
class getandsett{
    public static void main(String[] args){
        System.out.println("_______ Student _______");
        Student s1 = new Student();
        s1.setName("Agaesthya");
        s1.setMarks(67);

        System.out.println(s1.getName()+" \n"+s1.getMarks()+"\n"+s1.getGrade());

        s1.setMarks(150);
        System.out.println(s1.getName()+" \n"+s1.getMarks()+"\n"+s1.getGrade());


        System.out.println();
       // System.out.println("Bank ----");
        BankAccount b1 =  new BankAccount();
        b1.setAccDetails("Abhinav", 3000000);
      //  System.out.println("Account Delatils" + " \n" +b1.getHolderName() + " \n" + b1.getBalance() );

       // System.out.println("   B2   ");
        BankAccount b2 =  new BankAccount();
        b2.setAccDetails("Vasista", -3000000);
       // System.out.println("Account Delatils" + " \n" +b2.getHolderName() + " \n" + b2.getBalance() );

        System.out.println();

        //System.out.println("Employee  -----");
        Employee e1 = new Employee();
        e1.setName("Rahul");
        e1.setSalary(300000);

       // System.out.println(e1.getName() + " \n" + e1.getSalary());


    }
}