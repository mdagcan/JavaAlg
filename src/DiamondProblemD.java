interface A {
    default void display() {
        System.out.println("Display method from Interface A");
    }
}

interface B extends A {
    default void display() {
        System.out.println("Display method from Interface B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Display method from Interface C");
    }
}

class D implements B, C {
    @Override
    public void display() {
        // Resolving the diamond problem explicitly
        B.super.display(); // Calls the display method of Interface B
        C.super.display(); // Calls the display method of Interface C
        System.out.println("Display method from Class D");
    }
}

public class DiamondProblemD {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
