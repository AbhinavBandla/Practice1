import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("enter the length of an Array : ");
    int size = scanner.nextInt();
    scanner.nextLine();
    
    Car[] car = new Car[size];
    
    for(int i = 0 ;i< car.length ; i++){
        System.out.println("Enter car details ");
        System.out.print("Enter the brand  : ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter the colour  : ");
        String colour = scanner.nextLine();
        
        System.out.print("Enter the price  : ");
        int price = scanner.nextInt();
        scanner.nextLine();
        
        car[i] = new Car(colour, brand,price);
    }
    
    for (int j =0 ; j< car.length;j++){
        car[j].showCar();
        System.out.println();
    }
}
}
class Car{
    String brand;
    String colour;
    int price;
    
    
    Car(String colour, String brand,int price){
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }
    
     void showCar(){
        System.out.printf("Here is Your %s  %s  Worth of $%d ",colour,brand,price);
    }
}
