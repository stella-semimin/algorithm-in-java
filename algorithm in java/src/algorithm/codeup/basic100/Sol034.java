package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol034 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String st = scanner.next();
		scanner.close();
		
		int num = Integer.parseInt(st, 8);
		
		System.out.printf("%d",num);
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
