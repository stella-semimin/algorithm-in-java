package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol035 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String st = scanner.next();
		scanner.close();
		
		int num = Integer.parseInt(st, 16);
		
		System.out.printf("%o",num);
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
