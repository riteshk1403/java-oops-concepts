interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from B");
    }
}

class C implements A, B {

    // Must override to resolve ambiguity
    @Override
    public void show() {
        A.super.show();   // or B.super.show()
        System.out.println("Show from C");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
