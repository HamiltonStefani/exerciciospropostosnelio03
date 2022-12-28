package exerciciospropostosnelio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o número:");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("O número é negativo");
		}else {
			System.out.println("O número é positivo");
		}
		
		sc.close();

	}

}

