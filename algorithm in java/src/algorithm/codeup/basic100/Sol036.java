package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol036 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char alpa = scanner.next().charAt(0);
		int num = (int)alpa;
		System.out.printf("%d",num);
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

// scanner.next().split(���� ����);
