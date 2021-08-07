package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol058 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		if(a==0&&b==0) {
			System.out.println(1);
		}else
			System.out.println(0);	
	}
}
