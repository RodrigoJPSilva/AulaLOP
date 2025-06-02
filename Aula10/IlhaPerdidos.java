package Aula10;

public class IlhaPerdidos {
    public static void main(String[] args) {
        String[] entrada = {"4H", "3A"};
        String resultado = "";

        for (String codigo : entrada) {
            int qtd = Character.getNumericValue(codigo.charAt(0));
            char letra = codigo.charAt(1);
            for (int i = 0; i < qtd; i++) {
                resultado += letra;
            }
        }

        System.out.println(resultado);
    }
}
