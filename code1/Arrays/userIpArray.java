import java.util.Scanner;
class userIp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // to create an empty String data_type variable_name = new data_type[length];
        System.out.print("Enter the size of Array : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        
        String[] things = new String[size];

       // things[0]="hello";
        // things[1]="Cool";

        //using for loop 
        for(int i =0;i < things.length ; i++){
            System.out.print("Enter the things : ");
            things[i]=scanner.nextLine();
            
        }
        // to display the elements inside the array
        for(int j =0 ; j < things.length;j++){
            System.out.println(things[j]);
        }


    }
}