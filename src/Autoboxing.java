public class Autoboxing {
    public static void main(String[] args ){
        // para incrementar um valor no wrapper
        Integer intWrapper = Integer.valueOf(1);
        // convert de wrapper para int primitivo
        int intPrimitive = intWrapper.intValue();
        intPrimitive++;
        // convert de int primitivo para wrapper
        intWrapper= Integer.valueOf(intPrimitive);


        // autoboxing -> automaticamente converte de primitivo para wrapper
        Integer intWrapper1 = Integer.valueOf(1);
        intWrapper1++;

    }
}
