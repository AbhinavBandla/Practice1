import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the value to get Square : ");
        int a = scanner.nextInt();

        

        System.out.print("Enter the to know Even or not  : ");
        int b = scanner.nextInt();


        method1();
        method1();

        method2("Abhinav");
        method2("Janu");

        System.out.println("The square value is " +square(a));

        String result = (isEven(b))? +b+" is Even" : +b +" is odd\n" ;
        System.out.println(result);
        

    }
    // normal Method
    static void method1(){
        System.out.println("Hello Mr.");
        System.out.println("Cool Bro\n");
    }
    // declearing parameters in the  method
    static void method2(String name){ // we can pass required parameters here..9
        System.out.printf("Hello Mr/Mrs.%s\n",name);
    }

    static int square(int x ){
        return x*x;
    }

    static boolean isEven(int y ){
        return (y%2==0)? true : false;
    }
}