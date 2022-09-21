package br.com.estrutura.repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"JOAO", "PEDRO", "ALEX", "KELLY", "RILARY" };

        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
