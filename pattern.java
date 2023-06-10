package corejava;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("number of row to print");
		int myrow=scanner.nextInt();
		System.out.println("star pattern is...");
		for(int m=1; m<=myrow; m++) {
			for(int n=1; n<=m; n++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
