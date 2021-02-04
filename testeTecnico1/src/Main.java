import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A ;
		double B ;
		double C ;
		double X1;
		double X2;
		double delta;
		System.out.printf("A = ");
		A = sc.nextDouble();
		System.out.printf("B = ");
		B = sc.nextDouble();
		System.out.printf("C = ");
		C = sc.nextDouble();		
		delta = (B * B) - 4 * A * C;
		if (A == 0 || delta < 0) {
			System.out.println("Impossível calcular.");
		} else {
			X1 = (-B + Math.sqrt(delta)) / (2 * A);
			X2 = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f\n", X1);
			System.out.printf("R2 = %.5f\n", X2);
		}
	}
}
