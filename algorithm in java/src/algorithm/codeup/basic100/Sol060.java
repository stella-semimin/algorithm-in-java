package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol060 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		System.out.printf("%s",(a&b));	
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