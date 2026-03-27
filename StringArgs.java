
//String[] args is an array of Strings that stores command-line arguments passed -
// - from outside the program through the terminal when the program starts.
//        It is an array of Strings that stores data passed from outside the program.
/*
   STATIC is used in main() so the JVM can call it without creating an object.
   Static =  no object is needed.

   main() is the entry point (starting method) of a Java program.

   public means the main() method is accessible from anywhere, so the JVM can access it from outside the class.
   (Method is accessable from anywhere)

   static means the JVM can call main() without creating an object of the class.

   VOID means the method does not return any value.



   ****** class name must be same as File if it not the Public ....       ********
*/


class TeaShop {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}