package algorithm.codeup.basic100;

import java.util.Scanner;
public class Sol068 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		if(a>=90) {
			System.out.println("A");
		}else if(a<90 && a>=70) {
			System.out.println("B");
		}else if(a<70 && a>=40) {
			System.out.println("C");
		}else
			System.out.println("D");
	
	
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