import java.util.Scanner;
public class VerificarLetraA{
    public static void main(String Args[]){
        Scanner leitor = new Scanner(System.in);
        int contador = 0;

        System.out.println("Escreva uma frase:");
        String frase = leitor.nextLine();
        char[] caracteres = frase.toCharArray();

        for (char c : caracteres) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na String.");
        } else {
            System.out.println("A letra 'a' não aparece na String.");
        }
        leitor.close();
    }
}