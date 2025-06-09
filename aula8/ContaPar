package aula8

import java.util.Random;

public class ContarPares {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        Random rand = new Random();
        int totalPares = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1; // Número de 1 a 100
            System.out.print(vetor[i] + " ");

            if (vetor[i] % 2 == 0) {
                totalPares++;
            }
        }

        System.out.println("\nTotal de números pares: " + totalPares);
    }
}
