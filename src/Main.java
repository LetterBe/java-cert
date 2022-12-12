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
        System.out.println("Hello\n" + "World");


    }
}