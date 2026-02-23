import java.util.Scanner;

class switchB{
    public static void main(String[] args){
        System.out.println("Hello");
    Scanner scanner = new Scanner(System.in);

    int a;
    int b;
    char symbol;

    System.out.print("Enter the value for a : ");
    a=scanner.nextInt();
    System.out.print("Enter the value for b : ");
    b=scanner.nextInt();
    System.out.print("Enter the Symbol (+,-,*,%,/) :  ");
    symbol=scanner.next().charAt(0);

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