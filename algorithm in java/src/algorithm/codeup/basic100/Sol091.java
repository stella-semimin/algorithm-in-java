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

//%d (10���� ����)
//%s (���ڿ� ����)
//%f (�Ǽ��� ����)
//Locale ����
//%t (��¥�ð� ����)
//%c (�����ڵ� ���� ����)
//%o, %x(8����, 16���� ����)

//scanner.next().split(���� ����);