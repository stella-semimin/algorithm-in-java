package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol091 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		long cal = a*m+d;
		if(n==1) {
			System.out.println(n);
		}else {
			for(int i=2; i<n; i++) {
				cal = cal*m+d;
			}
			System.out.println(cal);
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