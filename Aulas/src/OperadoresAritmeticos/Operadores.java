package OperadoresAritmeticos;

public class Operadores {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = 10;
		num2 = 20;
		num3 = num1 + num2;
		System.out.println(num3);
		num3 = num1 - num2;
		System.out.println(num3);
		num3 = num1 * num2;
		System.out.println(num3);
		num3 = num1 / num2;
		System.out.println(num3);
		System.out.println("------------------");
		num1= 0;
		while(num1 <10) {
			num1++;
			System.out.println(num1);
		}

		while(num1 > 0) {
			System.out.println(num1);
			num1--;
		}
	}
}
