// ************   static keyword  ************
/*  
       static means the variable belongs to the class, not to objects,
        and all objects share the same single copy.

        non-static → belongs to each object ✅

        static → belongs to class, shared by all objects ✅

        Syntax Static data_type VAr_name = "Value";

        static variable should call with class name like this
        
        class_name variable_name = new_value;
 
 
 */
class Apartment{
    String flatname;
    int flatnum;
    static String appName = "Tranquuil Towers";

    Apartment(){

    }

    Apartment(String flatname, int flatnum){
        this.flatname = flatname;
        this.flatnum = flatnum;
    }

   
    
}
class stabase{
    public static void main(String[] args){
        Apartment a1 = new Apartment();
        a1.flatname = "R.Rahul";
        a1.flatnum = 503;

        Apartment a2 = new Apartment("Abhinav",504);

        System.out.println(a1.flatname + " " + a1.flatnum + " "+Apartment.appName);
        System.out.println(a2.flatname + " " + a2.flatnum + " "+Apartment.appName);
    }
}