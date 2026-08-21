/* 
    Polymorphism means:
    poly = Many 
    morph = Forms 
One thing can take multiple forms.

In Java, this means the same method call/reference can 
behave differently depending on the situation or object involved.

*/
class Animal{
    void sound(){
        System.out.println("Animals Makes Sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat makes 'Meows'");
    }
}
class PolyMorphism{
    public static void main(String[] args){
        Animal a1 = new Animal();
            a1.sound();

        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();
    }
}