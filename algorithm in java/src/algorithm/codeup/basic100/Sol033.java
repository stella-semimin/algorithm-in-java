package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol033 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = String.valueOf(Integer.toHexString(a)).toUpperCase();
		System.out.println(b);

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
