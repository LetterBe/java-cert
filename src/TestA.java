
class A {

    static int i;

    public static void main(String[] args) {
        i = Integer.valueOf("10");
        m1(i + 1);
    }

    private static void m1(Integer j) {
        System.out.println(j);
    }
}


class B {
    public static void main(String[] args) {
        int i = 10;
        m1(i);
    }

    private static void m1(Integer j) {
        System.out.println("go!");
    }
}


class C {

    static int i;

    public static void main(String[] args) {
        i = Integer.parseInt("10");
        m1(i + 1);
    }

    private static void m1(Integer j) {
        System.out.println(i);
    }
}



/*public class Test {
    static long i;

    public static void main(String[] args) {
        i = Integer.valueOf("10",8); // A
        m1(i); // B
    }

    private static void m1(Integer j) { // C
        System.out.println(j);
    }
}*/


public class TestA{
    public static void main(String[] args) {
        int a = Short.parseShort("126"); // A
        int s = Short.parseShort("23"); //B
        double h = Double.valueOf("27").floatValue();  //C
        System.out.println(a + h);
    }
}


/*public class TestB {

    public static void main(String[] args) {
        char c = new Character('x').charValue();
        System.out.println(c);
    }
}*/

 class E {

    public static void main(String[] args) {
        int a = Integer.parseInt("10",2);
        int b = a == 10 ? null : 3;
        System.out.println(a + b);
    }
}
