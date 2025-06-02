package Aula10;

public class MundoFeiticos {
    public static void main(String[] args) {
        String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
        String alvo = "Expelliarmus";

        int inicio = 0, fim = feiticos.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (feiticos[meio].equals(alvo)) {
                System.out.println("Feitiço encontrado na posição " + meio);
                return;
            } else if (feiticos[meio].compareTo(alvo) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Feitiço não encontrado.");
    }
}
