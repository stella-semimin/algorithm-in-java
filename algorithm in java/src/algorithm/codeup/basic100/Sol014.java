package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char x = scanner.next().charAt(0);
		char y = scanner.next().charAt(0);
		System.out.printf("%c %c", y, x);
		
		scanner.close();
	}

}

// %d (10���� ����)
// %s (���ڿ� ����)
// %f (�Ǽ��� ����)
// Locale ����
// %t (��¥�ð� ����)
// %c (�����ڵ� ���� ����)
// %o, %x(8����, 16���� ����)

