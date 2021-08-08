package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol078 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int i =0;
		int a = scanner.nextInt();
		for(i=0; i<=a; i++ ) {
			if(i%2==0) {
				sum = sum+ i;
			}
			
		}
		System.out.println(sum);
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