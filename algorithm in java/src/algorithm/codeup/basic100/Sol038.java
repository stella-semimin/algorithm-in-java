package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol038 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		scanner.close();
		long result = a+b;
		
		System.out.println(result);

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
