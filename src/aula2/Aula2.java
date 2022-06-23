package aula2;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double dist;
		
		double p1[] = lerPonto(scanner);
		double p2[] = lerPonto(scanner);
		
		dist = distancia(p1, p2);
		System.out.print(String.format("A distância do ponto 1 (%.2f;%.2f;%.2f)",p1[0],p1[1],p1[2]));
		System.out.print(String.format(" e do ponto 2 (%.2f;%.2f;%.2f) é de %.2f",p2[0],p2[1],p2[2],dist));
	}
	
	static double distancia(double[ ] p1, double[ ] p2) {
		return Math.sqrt(Math.pow(p2[0] - p1[0], 2)+Math.pow(p2[1] - p1[1], 2)+Math.pow(p2[2] - p1[2], 2));
	}
	
	static double[] lerPonto(Scanner scanner) {
		double ponto[] = new double[3];
		char[] cordenadas = {'X','Y','Z'};
		int i=0;
		for(char cord : cordenadas) {
			System.out.println("Qual a cordenada "+cord+" do seu ponto?");
			ponto[i] = scanner.nextDouble();
			i++;
		}
		return ponto;
	}

}
