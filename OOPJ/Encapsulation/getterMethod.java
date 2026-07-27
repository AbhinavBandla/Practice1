/*
Getter Method - 
Getter method is a method used to read the Values of the Private variable outside of the class 
***  A Getter allows other classes to safely read private data.  ***
and 
*** When another Java programmer sees: getAge(); they immediately think:

    "This method returns the age."  ***  
get method allow us to Assign the Private var data to the variable out of the class 
SYNTAX : 

returnType getVariableName() {
    return variableName;

    Note : Variable name (first letter capital) 
}

*/

class College{
    private String name = "IIT Bombay";
    private int pincode = 524346;

    // witjout getter 

    String showName(){
        return name;
    }

    int showPincode(){
        return pincode;
    }

    // using getter
    String getName(){
        return name;
    }
    int getPincode(){
        return pincode;
    }
    // to modify 
        public College(String name){
        this.name = name;
    }

    public College(String name, int pincode){
        this.name = name;
        this.pincode = pincode;
    }
}
/* main reason is Standard Conventions(JavaBeans Standard)

Here both the get.. and ShowName Works in same way but the only reason we this here
 when ever other Programmer see the code see the get he can recognise it as getter no going  
 through a complex task to find */
class GetterDemo{
    public static void main(String[] args){
        College c1 = new College("IIt Madras");


        String name = c1.getName();
        int pcode = c1.getPincode();

        System.out.println(name);
        System.out.println(pcode);
         
        String Name = c1.showName();
        System.out.println(Name);

        int PinCode = c1.showPincode();
        System.out.println(PinCode);

        College c2 = new College("IIT KarakPur", 524002);

        System.out.println("college 2" +" - "+ c2.getName() + " , " + c2.getPincode());

    }
}