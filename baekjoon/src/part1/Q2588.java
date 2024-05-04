package part1;

import java.util.Scanner;

public class Q2588 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, a,b,c ;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		a = num2/100;
		b = (num2%100)/10;
		c = (num2%100)%10;
		
		System.out.println(num1 * c);
		System.out.println(num1 * b);
		System.out.println(num1 * a);
		System.out.println(num1 * num2);
	}

}
