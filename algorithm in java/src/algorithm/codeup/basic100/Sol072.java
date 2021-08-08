package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol072 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		//System.out.println(count);
		int a[] = new int[count];
		for(int i=0; i<count; i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0; i<count; i++) {
			System.out.println(a[i]);
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