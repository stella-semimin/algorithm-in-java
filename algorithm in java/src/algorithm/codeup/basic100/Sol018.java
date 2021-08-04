package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time[] = scanner.next().split(":");
		System.out.println(time[0]+":"+time[1]);
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

