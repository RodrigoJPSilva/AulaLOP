package aula8;

import java.util.Random;

public class SomaElementos {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();
        int soma = 0;

        // Preenche o vetor com números aleatórios e calcula a soma
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1; // Gera números de 1 a 100
            soma += vetor[i];
        }

        // Exibe os números gerados
        System.out.print("Números gerados: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Exibe o resultado da soma
        System.out.println("\nSoma total: " + soma);
    }
}
