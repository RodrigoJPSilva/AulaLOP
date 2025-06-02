package Aula10;
import java.util.Scanner;

public class MascoteDaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosMascote1 = 0, votosMascote2 = 0;
        
        System.out.println("Vote no mascote (1 ou 2). Digite 'fim' para encerrar:");
        
        while (true) {
            String voto = scanner.next();
            if (voto.equalsIgnoreCase("fim")) break;
            if (voto.equals("1")) votosMascote1++;
            if (voto.equals("2")) votosMascote2++;
        }

        System.out.println("Mascote 1: " + votosMascote1 + " votos");
        System.out.println("Mascote 2: " + votosMascote2 + " votos");

        scanner.close();
    }
}
