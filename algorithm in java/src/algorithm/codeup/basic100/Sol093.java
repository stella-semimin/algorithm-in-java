package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol093 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int arr[] = new int[cnt];
		int arr2[] = new int[24];
		int num =0;
		
		for(int i=0; i<cnt; i++) {
			arr[i]= scan.nextInt();
			num=arr[i];
			arr2[num]++;
			
		}
		
		for(int i=1;i<=23;i++) {
			System.out.print(arr2[i]+" ");
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