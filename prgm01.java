class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("no one can brack");
        System.out.println("everyone one can brack");
    }
}
public class prgm01{
    public static void main(String args[]){
        Animal a= new Dog();
        a.sound();
    }
}