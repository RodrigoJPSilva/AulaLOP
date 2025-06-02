package Aula10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Heroi {
    String nome;
    int forca, inteligencia, velocidade;

    public Heroi(String nome, int forca, int inteligencia, int velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
    }

    public int calcularPoderTotal() {
        return forca * 2 + inteligencia * 3 + velocidade;
    }

    @Override
    public String toString() {
        return nome + " - Poder Total: " + calcularPoderTotal();
    }
}

public class RankingHerois {
    public static void main(String[] args) {
        List<Heroi> herois = new ArrayList<>();
        herois.add(new Heroi("Superman", 100, 80, 90));
        herois.add(new Heroi("Flash", 50, 70, 100));
        herois.add(new Heroi("Batman", 40, 100, 50));

        herois.sort(Comparator.comparingInt(Heroi::calcularPoderTotal).reversed());

        System.out.println("Ranking de Heróis:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }
    }
}
