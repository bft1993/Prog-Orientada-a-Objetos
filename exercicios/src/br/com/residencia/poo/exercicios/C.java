package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class C {
	public String nome;
	public int idade;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;

		System.out.println("Qual é o seu nome?");
		nome = ler.nextLine();

		System.out.println("\nQual é a sua idade?");
		idade = ler.nextInt();

		System.out.println("Seu nome é " + nome + " e sua idade é " + idade + "!");

		ler.close();

	}

}