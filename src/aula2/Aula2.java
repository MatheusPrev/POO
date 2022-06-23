package aula2;

public class Aula2 {

	public static void main(String[] args) {
		double p1[] = new double[3];
		double p2[] = new double[3];
		double dist;
		
		p1[0] = 1;
		p2[0] = 3;
		
		dist = distancia(p1, p2);
		System.out.print("Ola, Matheus Gomes Previatti " + dist);
	}
	
	static double distancia(double[ ] p1, double[ ] p2) {
		return p1[0] + p2[0];
	}

}
