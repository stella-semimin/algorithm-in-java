package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner로 주민등록번호 입력받기
		String jumin = scanner.next();
		String Array[] = jumin.split("\\-");
		
		String a =Array[0];
		String b =Array[1];
		
	
		System.out.printf("%s%s",a,b);
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

