import java.util.Locale;

public class Main {
    public String toString() {
        // com o metodo toString() podemos sobreescrever o main uma string quando chamamos o objeto no metodo
        return "Hello, World!";
    }

    public static void main(String[] args) {
        // java convert pra String com metodo toString(), da Object Class
        //  System.out.println(new Main());

        // podemos chamar um array, que por si so sao objetos
        //  System.out.println(new int[10]);

        // se passar um array de char, nao imprime string
        // System.out.println(new char[10]);

        // tenho que inicializar o array de char para poder imprmir as letras
        // tirando array de char, qualquer outro objeto que que passar para o metodo de print, ele vai chamar o metodo toString()
        //char [] letters = {'H', 'e', 'l', 'l', 'o'};
        // System.out.println(letters);

        //quebra de linha
        //System.out.println("Hello\n" + "World");

        // format encaixa o texto no % -> interpolacao de string
        // % b -> boolean, d -> numeros inteiros, f -> numeros decimais, s -> string, n -> new line
        //System.out.format("Hello, %s, have a nice day!","B.");
        //System.out.format("%s, o numero : %d tem %f de valor e é %b%n","Oi", 10, 10.5, true);
        // igual ao metodo format do C, está System.out.printf("foo"); internamente faz a mesma coisa

        // para indicar a ordem dos parametros, usa-se o numero e $, ex: %2$s. A base é 1
        //System.out.format("%2$s %1$s", "World", "Hello");

        //só o número é a quantidade mínima de caracteres que vai imprimir, se for menor, completa com espaços
        //System.out.format("[%5d]%n", 13);

        // a quantidade mínima é 5, foofoo tem 6, ele adiciona um.
        //System.out.format("[%5s]%n", "foofoo");

        // flag +, quando o numero for positivo, ele imprime o sinal de +. O de negativo sempre aparece
        System.out.format("[%+5d]%n", 13);
        System.out.format("[%5d]%n", -13);

        // (  -> coloca o numero dentro do parenteses
        //System.out.format("[%(5d]",-13);

        // flag alinhar a esquerda  -> - e preencher com 0 -> 0, antes do tamanho, só quando for numero
        System.out.format("[%-+5d]%n", 13);  // [+13  ]

        System.out.format("[%-5d]%n", -13);  //[-13  ]

        System.out.format("[%+05d]%n", 13); //[+0013]

        System.out.format("[%05d]%n", -13); //[-0013]


        // separar números
        System.out.format("[%,.2f]%n", 123456789.12345); //  [123.456.789,12]

        // 0 -> completa com 0 ; 8 -> tamanho minimo ; .2 -> duas casas decimais. Arredonda !
        System.out.format("%0,8.2f%n", 33.456); //  [00033,46]

        // usar class Locale para a lingua e o pais
        Locale br = new Locale("pt", "BR");
        System.out.printf(br, "%,.5f", 123456789.12345); //  [123.456.789,12]

    }
}