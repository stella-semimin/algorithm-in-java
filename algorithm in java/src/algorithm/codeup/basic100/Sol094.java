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

//%d (10���� ����)
//%s (���ڿ� ����)
//%f (�Ǽ��� ����)
//Locale ����
//%t (��¥�ð� ����)
//%c (�����ڵ� ���� ����)
//%o, %x(8����, 16���� ����)

//scanner.next().split(���� ����);