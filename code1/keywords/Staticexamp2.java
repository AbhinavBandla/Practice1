class Apartment{
    String flatname;
    int flatnum;
    static String appName = "Tranquuil Towers";


    Apartment(String flatname, int flatnum){
        this.flatname = flatname;
        this.flatnum = flatnum;
    }

    void display(){
        System.out.println( flatname + " " + flatnum + "  " + Apartment.appName);
    }
    
}
class stabase{
    public static void main(String[] args){
       Apartment a1 = new Apartment("Ganesg's",503);
       Apartment a2 = new Apartment("Suilaja", 504);

       a1.display();
       a2.display();
       
       Apartment.appName= "Sky Towers";
        a1.display();
        a2.display();
    }
}