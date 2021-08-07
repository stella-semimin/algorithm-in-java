package algorithm.codeup.basic100;

import java.util.Scanner;
public class Sol070 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		switch(a) {
		case 12:
		case 1:
		case 2:	
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;

		}
	
	}
}
			
//%d (10진수 형식)
//%s (문자열 형식)
//%f (실수형 형식)
//Locale 설정
//%t (날짜시간 형식)
//%c (유니코드 문자 형식)
//%o, %x(8진수, 16진수 형식)

//scanner.next().split(나눌 문자);