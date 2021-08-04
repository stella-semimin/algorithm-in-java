package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol025 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int a =scanner.nextInt();
		
		int b10000 = Math.floorDiv(a,10000)*10000;
		int b1000 = Math.floorDiv(a-b10000,1000)*1000;
		int b100 = Math.floorDiv(a-b10000-b1000,100)*100;
		int b10 = Math.floorDiv(a-b10000-b1000-b100,10)*10;
		int b1 = Math.floorMod(a-b10000-b1000-b100-b10, 10);
		System.out.println("["+b10000+"]");
		System.out.println("["+b1000+"]");
		System.out.println("["+b100+"]");
		System.out.println("["+b10+"]");
		System.out.println("["+b1+"]");
	
		
		scanner.close();
	}
}

// %d (10진수 형식)
// %s (문자열 형식)
// %f (실수형 형식)
// Locale 설정
// %t (날짜시간 형식)
// %c (유니코드 문자 형식)
// %o, %x(8진수, 16진수 형식)

// scanner.next().split(나눌 문자);

