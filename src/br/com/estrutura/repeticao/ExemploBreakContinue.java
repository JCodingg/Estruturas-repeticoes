package br.com.estrutura.repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

            System.out.println(numero);

        }
        //Qual a saída no console ?

    }
}
// O comando break interrompe o laço;
// já o continue interrompe somente a iteração atual.