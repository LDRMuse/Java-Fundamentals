package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10 prints from from the first System.out.println(a.i) because "int i" is a set instance variable of type A.
 *
 */
class A {
    int i = 10;

}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        System.out.println(a.i);
        System.out.println(b.i);
    }
}