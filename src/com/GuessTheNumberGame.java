package com;

import java.util.Scanner;

public class GuessTheNumberGame
{
	public static void main(String[] args)
	{
		System.out.println("Tem dez tentativas para adivinhar o número escondido!\n");
		int randomNumber = (int) (Math.random() * 100 + 1);
		Scanner scanner = new Scanner(System.in);
		boolean guessed = false;
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Tentativa número " + (i + 1));
			System.out.println("Indique o seu palpite: ");
			int guess = scanner.nextInt();
			if (guess == randomNumber)
			{
				System.out.println("Acertou em cheio!");
				break;
			}
			else if (guess < randomNumber)
			{
				System.out.println("O número é maior.");
			}
			else
			{
				System.out.println("O número é menor.");
			}
		}
	}

}
