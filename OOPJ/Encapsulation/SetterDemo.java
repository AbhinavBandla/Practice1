/*
Setter (Mutator): A method that modifies or sets the value of a private variable. 
It takes a parameter matching the variable's type and usually returns void.

A setter is a public method whose sole purpose is to take a new value as a parameter 
and assign it to a private field.

Syntax 

void setVariableName(dataType variableName){
this.variableName = variableName;
}
*/
class PersonNo{
    private String name = "N/A";
    private int age = 0;

    void setDetails(String name){
        this.name =  name;
    }
    void setDetails(int age){
        this.age = age;
    }
    void setDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

    void showDetails(){
        System.out.println(name+" "+age);
    }
}

class setterDemo{
    public static void main(String[] args){
        PersonNo p1 = new PersonNo();

        p1.setDetails("Abhinav");
        p1.showDetails();

        PersonNo p2 = new PersonNo();

        p2.setDetails(23);
        p2.showDetails();

        PersonNo p3 = new PersonNo();

        p3.setDetails("Ganesh",23);
        p3.showDetails();
    }
}