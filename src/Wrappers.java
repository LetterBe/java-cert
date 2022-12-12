public class Wrappers {
    public static void main (String[] args) {
        /* Wrappers sao objetos que representam tipos primitivos. Cada tipo primitivo tem um wrapper correspondente
        boolean = Boolean
        byte = Byte
        short = Short
        int = Integer
        long = Long
        float = Float
        double = Double
        char = Character
         */

        // todos os tipos primitivos numéricos tem 2 construtores, um que recebe um valor e outro que recebe a representacao como uma string
        // o metodo valueOf() é um metodo estatico, por isso nao precisa instanciar o objeto
        Double d1 = Double.valueOf(10.5);
        Double d2 = Double.valueOf("10.5");

        System.out.println(d1);
        System.out.println(d2);

        Character c1 = Character.valueOf('a');
        //Character c2 = Character.valueOf("a"); // nao compila, tem que ser um char

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("True");
        Boolean b4 = Boolean.valueOf("TRUE");
        Boolean b5 = Boolean.valueOf("TrUe");
        Boolean b6 = Boolean.valueOf("false");
        Boolean b7 = Boolean.valueOf("False");
        Boolean b8 = Boolean.valueOf("legal"); // nao compila, tem que ser true ou false

        System.out.println(b7);

        // String => primitivo: metodo parseX() é um metodo estatico, por isso nao precisa instanciar o objeto. Cada classe tem
        // seu proprio metodo parseX()

        double d13 = Double.parseDouble("10.5");
        int i1 = Integer.parseInt("10");

    }
}
