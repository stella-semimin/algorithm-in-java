package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol094 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]= scan.nextInt();
	
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
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