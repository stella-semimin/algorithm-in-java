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

//%d (10���� ����)
//%s (���ڿ� ����)
//%f (�Ǽ��� ����)
//Locale ����
//%t (��¥�ð� ����)
//%c (�����ڵ� ���� ����)
//%o, %x(8����, 16���� ����)

//scanner.next().split(���� ����);