import java.util.Scanner;
/* 2D array - it is array which allows you to store tha array in it 
sytax for it - data_type [][] array name = new data[rows][columns]

*/
class Main {
    public static void main(String[] args) {
        // passing array directly 
        System.out.println("*********assigning values directly ******");
        int[][ ] values = {{1,2,3},{4,5,6}};
        // to print it 
        for(int b =0 ; b<values.length;b++){
            for(int c = 0; c < values[b].length;c++){
                System.out.print(values[b][c]+ " ");
            }
            System.out.println();
        }

        System.out.println("********* user define **********");

        System.out.println("It is a String Array ");
        
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter the number of Rows : ");
        x=sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        y=sc.nextInt();
        sc.nextLine();
        System.out.println("Rows : "+ x + " \nColumns : "+ y);
        
        String[][] arr = new String[x][y];
        
        for(int i = 0 ;i<arr.length ; i++){
            for(int j =0 ; j<arr[i].length ;j++){
                System.out.print("Enter the value at "+i+" Row and "+j+" column : ");
                arr[i][j] = sc.nextLine();
            }
        }
        for(int k=0;k<arr.length;k++ ){
            for(int l=0;l<arr[k].length;l++){
                System.out.print(arr[k][l] + " ");
            }
             System.out.println();
        }


    }
}