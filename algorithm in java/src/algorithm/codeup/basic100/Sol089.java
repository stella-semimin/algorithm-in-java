package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol089 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		System.out.println(a+(d*(n-1)));

		
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