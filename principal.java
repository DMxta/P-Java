import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		double nota1, nota2, nota3, nota4, media;
		
		Scanner receber1 = new Scanner(System.in);
		System.out.println("Insira a sua primeira nota: ");
		nota1 = receber1.nextDouble();
		
		Scanner receber2 = new Scanner(System.in);
		System.out.println("Insira a sua segunda nota: ");
		nota2 = receber2.nextDouble();
		
		Scanner receber3 = new Scanner(System.in);
		System.out.println("Insira a sua terceira nota: ");
		nota3 = receber3.nextDouble();
		
		Scanner receber4 = new Scanner(System.in);
		System.out.println("Insira a sua quarta nota: ");
		nota4 = receber4.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		

		if (media>=6)
			System.out.print("Você foi aprovado, sua média é: ");
			else
			System.out.print("Você foi reprovado, sua média é: ");
			
		
		System.out.println(media);

	}

}