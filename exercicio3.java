public class exercicio3 {
    // int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
    // Ao final do processamento, qual será o valor da variável SOMA?

    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 1;
        while(k<indice){
            k++;
            soma+=k;
        }
        System.out.println(soma);
    }
}
