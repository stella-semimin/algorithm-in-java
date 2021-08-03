package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner로 date 입력받기
		String date = scanner.next();
		String dateAry[] = date.split("\\.");
		
		int yy = Integer.parseInt(dateAry[0]);
		int mm = Integer.parseInt(dateAry[1]);
		int dd = Integer.parseInt(dateAry[2]);
		
		
		
		System.out.printf("%04d.%02d.%02d",yy,mm,dd);
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

