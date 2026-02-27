import java.util.Scanner;
class argsvar{
    public static void main(String[] args){
        /*  VarArgs =  Varargs reduce the need for method overloading.

    Varargs is a special parameter that allows a method to accept zero or more arguments of the
     same type, and Java automatically converts them into an array inside the method.

        1. VarArgs helps reduce method overloading when number of parameters is not fixed.
        2.  We use varargs when we don't know how many arguments the user will pass.
           SYNTAX = returnType  methodName (dataType... variable_name)
         3. to pass the array list method   - - - returnType  mthodName (dataType[] variable_name)
             ex -  print(new int[]{1, 2, 3,})
             with varagrs print (1, 2, 3)
        4. A method allow only one vararg parameter and i must be last parameter
            like static void main (String name, int... num) - correct way 
                                  (int... num ,String name ) X 
        */
        Scanner scanner = new Scanner(System.in);

       // traditional Way 
       System.out.print("Enter the student id  : ");
       int id = scanner.nextInt();

       original(new int[] { 10,20,30});

       //var-args 
       System.out.println("Var-args");
       System.out.println();


        Print(40,550,77,55,3434,5667);
        Print(50,60);
        System.out.println();
        System.out.println();

        Twoparameter(id ,600,500,400);
       

    }

    //traditional 
    static void original(int[] count){
        for (int i =0 ; i < count.length;i++){
            System.out.println(count[i]);
        }
    }

    static void Print(int... num){
        //normal for loop
      for(int x=0;x < num.length;x++){
        System.out.println(num[x]);
      }

      //enhanced for-Loop for (int x : num) is like for x in num in(py)
      /*   for(int x : num){
            System.out.println(x);
        }
        */
    }
    static void Twoparameter(int id,int... marks){
        System.out.println("id is "+ id );
        for (int x : marks){
            System.out.println(x);
        }

        
    }
}