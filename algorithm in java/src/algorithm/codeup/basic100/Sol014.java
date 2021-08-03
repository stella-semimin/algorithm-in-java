package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char x = scanner.next().charAt(0);
		char y = scanner.next().charAt(0);
		System.out.printf("%c %c", y, x);
		
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

