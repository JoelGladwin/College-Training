//public scope

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		int n = 5;

		LeftAngledTriangle obj = new LeftAngledTriangle(n);
        System.out.println();
        RightAngledTriangle obj1 = new RightAngledTriangle(n);
	}
}

class LeftAngledTriangle {

	LeftAngledTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

class RightAngledTriangle {

	RightAngledTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int sp=(n-i)-1; sp>0; sp--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

