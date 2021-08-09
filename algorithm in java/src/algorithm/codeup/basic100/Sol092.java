package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol092 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int day=1;
		while(day%a!=0|| day%b!=0|| day%c!=0) {
			day++;
			//break;
		}
			System.out.println(day);
		
	
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