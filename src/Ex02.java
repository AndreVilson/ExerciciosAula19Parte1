package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2*/

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorB = new int[8];
		int[] vetorA = new int[vetorB.length];
		System.out.println(" valores do vetorB");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite o valor da posição " + i + " = ");
			vetorB[i] = scan.nextInt();
			vetorA[i] = vetorB[i] * 2;
		}
		System.out.println("VetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");

		}
		System.out.println("");

		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

	}

}
