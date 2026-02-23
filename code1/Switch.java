import java.util.Scanner;

class switchB{
    public static void main(String[] args){
        System.out.println("Hello");
    Scanner scanner = new Scanner(System.in);

    int a;
    int b;
    char symbol;

    int c;


    System.out.println("Enter a number between (1 to 7) to check the week  : ");
        c= scanner.nextInt();

    switch(c){
        case 1 : 
        System.out.println("Monday"); break ;
        case 2 : System.out.println("Tuesday"); break ;
        case 3 : System.out.println("wednesday");break ;
        case 4 : System.out.println("Thursday");break ;
        case 5 : System.out.println("Friday");break ;
        case 6 : System.out.println("Saturday");break ;
        case 7 : System.out.println("Sunday");break ;
        default : System.out.println("Enter the vaild number ");break ;

    }

    System.out.print("Enter the value for a : ");
    a=scanner.nextInt();
    System.out.print("Enter the value for b : ");
    b=scanner.nextInt();
    System.out.print("Enter the Symbol (+,-,*,%,/) :  ");
    symbol=scanner.next().charAt(0);
        // new version of switch statement 
    switch(symbol){
        case '+' -> System.out.println(a+b);
        case '-'-> System.out.println(a-b);
        case '*' -> System.out.println(a*b);
        case '%' -> System.out.println(a%b);
        case '/' -> System.out.println(a/b);
        default -> System.out.println("Enter a valid Symbol..!  ");
    }
}
}