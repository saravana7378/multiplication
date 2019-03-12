package org.multi;

import java.util.Scanner;

public class Multipilication {
	public static void main(String[] args) {
		System.out.println("enter the range");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("enter the number ");
		int b = sc.nextInt();
		System.out.println(b);
		int n;
		for (int i = 1; i <=b; i++) {
			n = a*i;
			System.out.println(i+"*"+a+"="+n);
			
		}
	}

}
