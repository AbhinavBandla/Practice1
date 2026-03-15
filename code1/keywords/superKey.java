/*   **********   super keyword   *************
        super is used to assign the value for the Parent_class parameterized constructor 
        inside the child - constructor

        the suntax is 
        super(value);

 */
class school{
    String name ;
    String Address;

    school(String name,String Address){
        this.name = name ;
        this.Address = Address;
    }

    void schoolDetails(){
        System.out.println(name + " " + Address);
    }

}
class office extends school{
    int pincode ;

        office(String name, String Address , int pincode){
          super(name , Address );
          this.pincode = pincode;
        
        }
    void showDetails(){
        System.out.println(name+ " "+ Address + " " + pincode);
    }

}
// ********** main class
class skey{
    public static void main(String[] args){
        office o1 = new office("Infosis","whiteFields , Hyderabad",524346);
        o1.showDetails();
        o1.schoolDetails();
    }
}