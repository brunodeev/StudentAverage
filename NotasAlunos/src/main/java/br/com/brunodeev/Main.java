package br.com.brunodeev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String name = scanner.next();

        System.out.print("Digite a quantidade de notas do aluno: ");
        int quantity = scanner.nextInt();

        ArrayList<Double> grades = new ArrayList<>();

        for(int i = 1; i <= quantity; i++){
            Scanner newScanner = new Scanner(System.in);
            System.out.print("Nota " + i + ": ");
            grades.add(newScanner.nextDouble());
        }

        Aluno aluno = new Aluno();
        aluno.name = name;
        aluno.grades = grades;

        double average = aluno.isApproved();

        if (average >= 6.0) {
            System.out.printf("\nSua média foi de %.1f\n", average);
            System.out.print("APROVADO");
        } else {
            System.out.printf("Sua média foi de %.1f\n", average);
            System.out.print("REPROVADO");
        }
    }
}