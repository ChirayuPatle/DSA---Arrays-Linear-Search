package ArraysExamples;

class Animal{
    void sound(){
        System.out.println("Animal class");
    }
}

class Dog extends Animal{
    void Bark(){
        System.out.println("Dog barks");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
        // upcasting (subclass -> superclass)
        Animal a = new Dog();
        a.sound();

        // downcasting (superclass -> subclass)
        Dog d = (Dog) a;
        d.Bark();


//        // type casting
//        int a =10;
//        System.out.println(a);
//        double n = (double)(a);
//        System.out.println(n);
//        // Rule: should be small valued then previous
//        int r =(int)(n);
//        System.out.println(r);

    }
}
